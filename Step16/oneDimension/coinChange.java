package Step16.oneDimension;


import java.util.Arrays;

public class coinChange {
    public static int CoinChange(int idx,int target,int[] coins,int[][] dp){
        if(target == 0) return 1;
        if(target<0 || idx<0) return 0;
        if(dp[idx][target] !=-1) return dp[idx][target];
        int take = CoinChange(idx, target-coins[idx], coins,dp);
        int nottake = CoinChange(idx+1,target,coins,dp);
        return dp[idx][target] = take +nottake;
    }
    // public static int CoinChange(int[] coins,int target){
    //     int[][] dp = new int[coins.length][target+1];

    // }
    public static void main(String[] args) {
        int[] coins={1,2,3};
        int target = 4;
        int[][] dp = new int[coins.length][target];
        for(int[] row:dp){
            Arrays.fill(row,-1);
            System.out.println(CoinChange(coins.length-1, target, coins, dp));
        }
    }

    
}
