package Revision.DP;
import java.util.*;

public class countSubset {
    public static int helper(int idx,int target,int[] arr,int[][] dp){
        if(target==0) return 1;
        if(idx==0) return (arr[0]==target?1:0);
        if(dp[idx][target]!=-1){
            return dp[idx][target];
        }
        int nottake = helper(idx-1,target,arr,dp);
        int take =0;
        if(arr[idx]<=target)
            take = helper(idx-1,target-arr[idx],arr,dp);

        return dp[idx][target] = take + nottake;
    }
    public static int SubsetCount(int[] arr,int target){
        int n = arr.length;
        int[][] dp = new int[n][target+1];
        for(int[] row:dp){
            Arrays.fill(row,-1);
        }
        return helper(n-1,target,arr,dp);
    }

    // tabulation

    public static int SubsetCount2(int[] arr,int target){
        int n = arr.length;
        int[][] dp = new int[n][target+1];
        dp[0][0] =1;
        if (arr[0] <= target) dp[0][arr[0]] = 1;
        for(int i =1;i<n;i++){
            for(int j =0;j<=target;j++){
                int notTake = dp[i-1][j];
                int take = 0;
                if(arr[i]<=j){
                    take = dp[i-1][j-arr[i]];
                }
                dp[i][j] = take+notTake;
            }
        }
        return dp[n-1][target];
    }


    //space optimisation

    public static int SubsetCount3(int[] arr,int target){
        int n = arr.length;
        int[] dp = new int[target+1];
        dp[0] =1;
        if (arr[0] <= target) dp[arr[0]] = 1;
        for(int i =1;i<n;i++){
            int[] curr = new int[target+1];
            curr[0] =1;
            for(int j =0;j<=target;j++){
                int notTake = dp[j];
                int take = 0;
                if(arr[i]<=j){
                    take = dp[j-arr[i]];
                }
                curr[j] = take+notTake;
            }
             dp = curr;
        }
        return dp[target];
       
    }
    public static void main(String[] args) {
        int[] arr={1,2,2,3};
        int target = 3;
        System.out.println(SubsetCount(arr, target));
        System.out.println(SubsetCount2(arr, target));
        System.out.println(SubsetCount3(arr, target));
    }
    
}
