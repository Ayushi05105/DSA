package Step16.oneDimension;


import java.util.Arrays;



public class kthFrogJump {
    public static int helper(int idx,int[] arr,int k,int[] dp){
        if(idx == 0) return 0;
        if(dp[idx]!=-1) return dp[idx];
        int minStep = Integer.MAX_VALUE;
        for(int i =1;i<=k;i++){
            if(idx-i>=0){
                int jump = helper(idx-i, arr, k,dp) + Math.abs(arr[idx]-arr[idx-i]);
                minStep=Math.min(minStep, jump);
            }
        }
        return  dp[idx]=minStep;

    }
    public static int frogJump(int n,int[] arr,int k){
        int[] dp = new int[n];
        Arrays.fill(dp,-1);
        return helper(n-1, arr,k, dp);

    }
    public static int frogJump2(int n ,int[] arr,int k){
        int[] dp = new int[n];
        dp[0] = 0;
        for(int i=1;i<n;i++){
            int minStep=Integer.MAX_VALUE;
            for(int j =1;j<=k;j++){
                if(i-j>=0){
                    int jump = dp[i-j] + Math.abs(arr[i]-arr[i-j]);
                    minStep=Math.min(minStep, jump);
                }
            }
            dp[i] = minStep;
        }
        return dp[n-1];

    }

    public static int Tabulation(int n,int[] arr,int k){
        int[] dp = new int[n];
        dp[0] =0;
        for(int i =1;i<n;i++){
            int minStep = Integer.MAX_VALUE;
            for(int j =1;j<=k;j++){
                if(i-j>=0){
                    int jump = dp[i-j] + Math.abs(arr[i]-arr[i-j]);
                    minStep = Math.min(minStep,jump);
                }
            }
            dp[i] = minStep;  
        }
        return dp[n-1];
    }
    public static void main(String[] args) {
        int[] arr={5,7,8,20,34,90,21,54};
        int k =3;
        int n = arr.length;
        System.out.println(frogJump(arr.length, arr, k));
        System.out.println(frogJump2(arr.length, arr, k));
        System.out.println(Tabulation(n, arr, k));
    }
    
}
