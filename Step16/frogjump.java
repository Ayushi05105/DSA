package Step16;

import java.util.Arrays;

public class frogjump {
    
    public static int helper(int idx,int[] arr,int[] dp){
        if(idx == 0) return 0;
        if(dp[idx]!=-1) return dp[idx];
        int left = helper(idx-1, arr, dp) + Math.abs(arr[idx]-arr[idx-1]);
        int right = Integer.MAX_VALUE;
        if(idx >1){
            right = helper(idx-2, arr, dp) + Math.abs(arr[idx]-arr[idx-2]);
        }
        
        return dp[idx] = Math.min(left, right);

    }
    public static int FrogJump(int n,int[] arr){
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        return helper(n-1, arr, dp);
    }

    // Tabulation
    public static int FrogJump2(int n,int[] arr){
        int[] dp = new int[n];
        Arrays.fill(dp,0);
        dp[0]=0;
        for(int i =1;i<n;i++){
            int left = dp[i-1] + Math.abs(arr[i]-arr[i-1]);
            int right = Integer.MAX_VALUE;
            if(i>1){
                right = dp[i-2] + Math.abs(arr[i]-arr[i-2]);
            }
             dp[i] = Math.min(left,right);
        }
        return dp[n-1];
    }
    public static void main(String[] args) {
        int[] arr={30,10,60,10,60,50};
        System.out.println(FrogJump(arr.length, arr));
        System.out.println(FrogJump2(arr.length, arr));

    }
}

