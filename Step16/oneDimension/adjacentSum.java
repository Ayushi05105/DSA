package Step16.oneDimension;


import java.util.Arrays;

public class adjacentSum {
    public static int helper(int[] arr,int idx,int[] dp){
        dp[0] = arr[0];
        if(idx<0) return 0;
        if(dp[idx] !=-1) return dp[idx];

        int pick = arr[idx] +helper(arr, idx-2, dp);
        int notPick = helper(arr, idx-1, dp);
        return dp[idx] = Math.max(pick,notPick);

    }
    public static int AdjacentSum(int[] arr){
        int n = arr.length;
        int[] dp = new int[n];
        Arrays.fill(dp,-1);
        return helper(arr,n-1, dp);
    } 

    public static void main(String[] args) {
        int[] arr ={2,1,4,9};
        System.out.println(AdjacentSum(arr));
    }
    
}
