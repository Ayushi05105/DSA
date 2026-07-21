package DP.OneD_DP;
import java.util.*;

public class kthFrogJump {

    public static int helper(int idx,int[] height,int[] dp,int k){
        if(idx ==0) return 0;
        if(dp[idx]!=-1) return dp[idx];
        int mn = Integer.MAX_VALUE;
        for(int i = 1;i<=k;i++){
            if(idx-i>=0){
            int step = helper(idx-i,height,dp,k) + Math.abs(height[idx]-height[idx-i]);
             mn = Math.min(mn,step);
            }
        }
        return dp[idx] = mn;
    }
    public static int jump(int[] height,int k){
        int n = height.length;
        int[] dp = new int[n];
        Arrays.fill(dp,-1);
        return helper(n-1, height, dp, k);
    }

    public static int helper2(int idx,int[] height,int[] dp,int k){
        int n = height.length;
        dp[0] =0;
        for(int i =1;i<n;i++){
            int mn = Integer.MAX_VALUE;
            for(int j = 1;j<=k;j++){
                if(i-j>=0){
                    int jump = dp[i-j] + Math.abs(height[i]-height[i-j]);
                    mn = Math.min(mn,jump);
                }
            }
            dp[i] = mn;
            }
            return dp[n-1];
    }

    public static int jump2(int[] height,int k){
        int n = height.length;
        int[] dp = new int[n];
        Arrays.fill(dp,-1);
        return helper(n-1,height,dp,k);
    }
    public static void main(String[] args) {
        int[] height = {10,5,20,0,15};
        int k =2;
        System.out.println(jump(height, k));
        System.out.println(jump2(height, k));
    }
    
}
