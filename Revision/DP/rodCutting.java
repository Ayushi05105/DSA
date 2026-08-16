package Revision.DP;
import java.util.*;
public class rodCutting {


    // recursion
    public static int helper(int idx,int[] price,int n){
        if(idx ==0){
            return n*price[0];
        }

        int notTake = helper(idx-1,price,n);
        int take = Integer.MIN_VALUE;
        int rodLength = idx+1;
        if(rodLength<=n){
            take = price[idx] + helper(idx, price, n- rodLength);
        }
        return Math.max(take,notTake);
    }

    //memoisation
    public static int helper2(int idx,int[] price,int n,int[][] dp){
        if(idx ==0){
            return n*price[0];
        }

        if(dp[idx][n]!=-1){
            return dp[idx][n];
        }
        int notTake = helper2(idx-1,price,n,dp);
        int take = Integer.MIN_VALUE;
        int rodLength = idx+1;
        if(rodLength<=n){
            take = price[idx] + helper2(idx, price, n- rodLength,dp);
        }
        return dp[idx][n] = Math.max(take,notTake);
    }

    public static int RodCutting(int[] price,int n){
        int[][] dp = new int[n][n+1];
        for(int[] row:dp){
            Arrays.fill(row,-1);
        }
        return helper2(n-1,price,n,dp);
    }


    // tabulation

    public static int RodCutting2(int[] price,int n){
        int[][] dp = new int[n][n+1];
        for(int j =0;j<=n;j++){
            dp[0][j] = j * price[0];
        }
        for(int i =1;i<n;i++){
            for(int j =1;j<=n;j++){
                int notTake = dp[i-1][j];
                int take = Integer.MIN_VALUE;
                int rodLength = i+1;
                if(rodLength<=j){
                    take = price[i] + dp[i][j-rodLength];
                }
                dp[i][j] = Math.max(take,notTake);
            }
        }
        return dp[n-1][n];
    }

    public static void main(String[] args) {
        int[] price ={1,6,8,9,10,19,7,20};
        int n =8;
        System.out.println(RodCutting(price, n));
        System.out.println(RodCutting2(price, n));
    }
    
}
