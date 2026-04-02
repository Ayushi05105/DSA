package Step16.Subsequence;

import java.util.Arrays;

public class partitionEqual {

    public static boolean helper(int idx,int target,int[] arr){
        if(target==0) return true;
        if(idx ==0 ) return arr[0] == target;
        boolean notTake=helper(idx-1, target, arr);
        boolean take = false;
        if(arr[idx]<=target){
            take = helper(idx-1, target-arr[idx], arr);
        }
        return take || notTake;
    }

    public static boolean partition(int[] arr){
        int n = arr.length;
        int sum =0;
        for(int i =0;i<n;i++){
            sum+=arr[i];
        }
        if(sum %2 != 0) return false;
         int target = sum /2;

         return helper(n-1, target, arr);

    }


    //MEMOIZATION


    public static boolean helper2(int idx,int target,int[] arr,int[][] dp){
        if(target == 0) return true;
        if(idx == 0) return arr[0]==target;
        if(dp[idx][target] !=-1) return dp[idx][target]==1;
        boolean notTake = helper2(idx-1, target, arr,dp);
        boolean take = false;
        if(arr[idx]<=target){
            take = helper2(idx-1, target-arr[idx], arr, dp);
        }
        dp[idx][target] = (take || notTake)?1:0;
        return take || notTake;

    }
    public static boolean memoization(int[] arr){
        int n = arr.length;
        int sum =0;
        for(int i =0;i<n;i++){
            sum+=arr[i];
        }
        if(sum %2 != 0) return false;
         int target = sum /2;
         int[][] dp = new int[n][target+1];
         for(int[] row:dp){
            Arrays.fill(row,-1);
         }
         return helper2(n-1,target,arr,dp);

    }
    public static void main(String[] args) {
        int[] arr ={1,2,4,5};
        System.out.println(partition(arr));
        System.out.println(memoization(arr));
    }
    
}
