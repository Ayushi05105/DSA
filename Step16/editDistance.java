package Step16;

import java.util.*;

public class editDistance {

     public static int recursion(String s1,String s2,int i ,int j){
        if(i<0) return j+1;
        if(j<0) return i+1;
        if(s1.charAt(i) == s2.charAt(j)){
            return recursion(s1, s2, i-1, j-1);
        }
        int min = 1 + Math.min(recursion(s1, s2, i-1, j-1),Math.min(recursion(s1, s2, i-1, j),recursion(s1, s2, i, j-1))) ;
        return min;
     }

     public static int editdistance(String s1,String s2){
        
        return recursion(s1, s2, s1.length()-1, s2.length()-1);
     }


     public static int memoization(String s1,String s2,int i,int j,int[][] dp){
        if(i<0) return j+1;
        if(j<0) return i+1;
        if(dp[i][j] != -1) return dp[i][j];
        if(s1.charAt(i) == s2.charAt(j)){
            return dp[i][j]= memoization(s1, s2, i-1, j-1,dp);
        }
        dp[i][j] = 1 + Math.min(memoization(s1, s2, i-1, j-1,dp),Math.min(memoization(s1, s2, i-1, j,dp),memoization(s1, s2, i, j-1,dp))) ;
        return dp[i][j];
     }

     public static int editdistance2(String s1,String s2){
        int n = s1.length();
        int m = s2.length();
        int[][] dp = new int[n][m];
        for(int[] row:dp){
        Arrays.fill(row,-1);
        }
        return memoization(s1, s2, s1.length()-1, s2.length()-1, dp);

     }


     public static int tabulation(String s1,String s2){
        int n = s1.length();
        int m = s2.length();
        int[][] dp = new int[n+1][m+1];
        
        
        for(int i =0;i<n;i++){
            dp[i][0] = i;
        }
        for(int j = 0;j<m;j++){
            dp[0][j] = j;
        }
        for(int i =1;i<=n;i++){
            for(int j =1;j<=m;j++){
                if(s1.charAt(i-1) == s2.charAt(j-1)){
                     dp[i][j] = dp[i-1][j-1];
                }
                else {
                    dp[i][j] = 1 + Math.min(dp[i-1][j-1] , Math.min(dp[i][j-1] , dp[i-1][j])) ;
                }
            }
        }
        return dp[n][m];
     }

     
     public static void main(String[] args) {
        String s1 = "horse";
        String s2 = "ros";
        System.out.println(editdistance(s1, s2));
        System.out.println(editdistance2(s1, s2));
        System.out.println(tabulation(s1, s2));
     }
     
    
}
