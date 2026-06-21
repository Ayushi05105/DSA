package Revision.DP;
import java.util.*;

public class frogJump {
    public static int jump(int n,int[] arr){
        int[] dp = new int[n];
        Arrays.fill(dp,-1);
        dp[0] = 0;
        for(int i =1;i<n;i++){
            int left = dp[i-1]+Math.abs(arr[i]-arr[i-1]);
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
        int n = arr.length;
        System.out.println(jump(arr.length, arr));
    }
    
}
