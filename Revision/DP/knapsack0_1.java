package Revision.DP;

public class knapsack0_1 {
    //recursion

    public static int helper(int idx,int w,int[] wt,int[] val){
        if(idx ==0){
            if(wt[0]<=w) return val[0];
            return 0;
        }
        int notTake =0 +helper(idx-1,w,wt,val);
        int take = Integer.MIN_VALUE;
        if(wt[idx]<=w){
            take = val[idx]+helper(idx-1, w-wt[idx], wt, val);
        }
        return Math.max(take,notTake);
    }

    // memoization
    public static int helper2(int idx,int w,int[] wt,int[] val,int[][] dp){
        if(idx ==0){
            if(wt[0]<=w) return val[0];
            return 0;
        }
        if(dp[idx][w] !=-1){
            return dp[idx][w];
        }
        int notTake =0 +helper2(idx-1,w,wt,val,dp);
        int take = Integer.MIN_VALUE;
        if(wt[idx]<=w){
            take = val[idx]+helper2(idx-1, w-wt[idx], wt, val,dp);
        }
        return dp[idx][w] = Math.max(take,notTake);
    }


    public static int knapSack(int[] weight,int[] value,int n,int maxWeight){
        int[][] dp = new int[n][maxWeight+1];
        for(int i = 0; i < n; i++){
            for(int j = 0; j <= maxWeight; j++){
                dp[i][j] = -1;
            }
        }

        return helper2(n-1, maxWeight, weight, value, dp);
    }

    //tabulation
    

    public static int knapSack2(int[] wt,int[] val,int n,int maxWeight){
        int[][] dp = new int[n][maxWeight+1];
        for(int i = 0; i < n; i++){
            for(int j = 0; j <= maxWeight; j++){
                dp[i][j] = -1;
            }
        }

        for(int w=wt[0];w<=maxWeight;w++) dp[0][w] = val[0];

        for(int idx =1;idx<n;idx++){
            for(int w=0;w<=maxWeight;w++){

                int notTake = dp[idx-1][w];
                int take =Integer.MIN_VALUE;
                if(wt[idx]<=w){
                    take = val[idx]+dp[idx-1][w-wt[idx]];
                }
                dp[idx][w] = Math.max(take,notTake);
            }
        }

        return dp[n-1][maxWeight];
    }
    public static void main(String[] args) {
        int w =4;
        int[] val = {1,2,3};
        int[] wt = {4,5,1};
        System.out.println(knapSack(wt, val, wt.length, w));
        System.out.println(knapSack2(wt, val, wt.length, w));

    }

    
}
