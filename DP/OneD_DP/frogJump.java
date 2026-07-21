package DP.OneD_DP;

import java.util.Arrays;

public class frogJump {
    public static int helper(int idx,int[] height,int[] dp){
        if(idx ==0) return 0;
        if(dp[idx] !=-1) return dp[idx];
        int one = helper(idx-1,height,dp) + Math.abs(height[idx]-height[idx-1]);
        int two = Integer.MAX_VALUE;
        if(idx>1){
            two = helper(idx-2,height,dp) + Math.abs(height[idx]-height[idx-2]);
        }
        dp[idx] = Math.min(one,two);
        return dp[idx];
    } 
    public static int jump(int[] height){
        int n = height.length;
        int[] dp = new int[n];
        Arrays.fill(dp,-1);
        return helper(n-1,height,dp);
    }
    public static void main(String[] args) {
        int[] height = {2,1,3,5,4};
        System.out.println(jump(height));
    }
    
}
