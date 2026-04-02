package Step16.Subsequence;

import java.util.Arrays;

public class subsetSum {

    public static boolean recursion(int idx,int target,int[] arr){
        if(target == 0) return true;
        if(idx ==0) return arr[0] == target;
        boolean notTake = recursion(idx-1, target, arr);
        boolean take = false;
        if(target >= arr[idx]){
            take = recursion(idx-1, target-arr[idx], arr);
        }
        return (take || notTake);
    }

    public static boolean memoization(int idx,int target,int[] arr,int[][] dp){
        if(target == 0) return true;
        if(idx ==0) return arr[0] == target;
        if(dp[idx][target] != -1) return dp[idx][target]==1;
        boolean notTake = memoization(idx-1, target, arr,dp);
        boolean take = false;
        if(target >= arr[idx]){
            take = memoization(idx-1, target-arr[idx], arr,dp);
        }
        dp[idx][target] = (take || notTake) ?1:0;
        return (take || notTake);
    }

    public static boolean subsetsum(int n ,int target,int[] arr){
        int[][] dp = new int[n][target+1];
        for(int[] row:dp){
            Arrays.fill(row,-1);
        }
        return memoization(n-1, target, arr, dp);

    }


    public static boolean tabulation(int n,int target,int[] arr){
        boolean[][] dp = new boolean[n][target+1];
        for(int i =0;i<n;i++){
            dp[i][0] = true; 
        }
        if(arr[0]<=target)  dp[0][arr[0]]= true;
       

        for(int i =1;i<n;i++){
            for(int j =1;j<=target;j++){

                boolean nottake = dp[i-1][j];
                boolean take = false;

                if(arr[i]<=j) take = dp[i-1][j-arr[n]];
                dp[i][j] = (take || nottake);

            }
        }
        return dp[n-1][target];
    }

     public static boolean spaceOptimise(int n,int target,int[] arr){
        boolean[] prev = new boolean[target+1];
    
        prev[0] = true; 
        
        if(arr[0]<=target)  prev[arr[0]]= true;
       

        for(int i =1;i<n;i++){
            boolean[] curr = new boolean[target+1];
            for(int j =1;j<=target;j++){

                boolean nottake = prev[j];
                boolean take = false;

                if(arr[i]<=j) take = prev[j-arr[n]];
                curr[j] = (take || nottake);

            }
            prev = curr;
        }
        return prev[target];
    }



    public static void main(String[] args) {
        int[] arr ={2,3,1,1};
        int target =4;
        
        System.out.println(recursion(arr.length-1, target, arr));
        System.out.println(subsetsum(arr.length, target, arr));
        System.out.println(tabulation(arr.length-1, target, arr));
        System.out.println(spaceOptimise(arr.length-1, target, arr));
    }
    
}
