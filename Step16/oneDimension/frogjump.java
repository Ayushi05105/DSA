package Step16.oneDimension;


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

    public static int Tabulation(int n, int[] arr){
        int[] dp = new int[n];
        Arrays.fill(dp,-1);
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

    public static int spaceOptimisation(int n ,int[] arr){
        int prev = 0;
        int prev2 =0;
        for(int i =1;i<n;i++){
            int left = prev + Math.abs(arr[i]-arr[i-1]);
            int right = Integer.MAX_VALUE;
            if(i>1){
                right = prev2 + Math.abs(arr[i]-arr[i-2]);
            }
            int curr = Math.min(left,right);
            prev2 = prev;
            prev = curr;

        }
        return prev;
    }
    public static void main(String[] args) {
        int[] arr={30,10,60,10,60,50};
        int n = arr.length;
        System.out.println(FrogJump(arr.length, arr));
        System.out.println(FrogJump2(arr.length, arr));
        System.out.println(Tabulation(n, arr));
        System.out.println(spaceOptimisation(n, arr));

    }
}

