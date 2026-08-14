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
    public static void main(String[] args) {
        int[] arr={1,2,2,3};
        int target = 3;
        System.out.println(SubsetCount(arr, target));
    }
    
}
