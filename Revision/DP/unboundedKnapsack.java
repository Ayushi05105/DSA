package Revision.DP;
import java.util.*;

public class unboundedKnapsack {

    // recursion

    public static int helper(int[] wt,int[] val,int idx,int w){
        if(idx ==0){
            return (w /wt[0])*val[0];
        }
        int notTake = helper(wt,val,idx-1,w);
        int take = Integer.MIN_VALUE;
        if(wt[idx]<=w){
            take = val[idx] +helper(wt,val,idx,w-wt[idx]);
        }
        return Math.max(take,notTake);
    }

    // memoization

    public static int helper(int[] wt,int[] val,int idx,int w,int[][] dp){
        if(idx ==0){
            return (w /wt[0])*val[0];
        }
        if(dp[idx][w] !=-1){
            return dp[idx][w];
        }
        int notTake = helper(wt,val,idx-1,w,dp);
        int take = Integer.MIN_VALUE;
        if(wt[idx]<=w){
            take = val[idx] +helper(wt,val,idx,w-wt[idx],dp);
        }
        return dp[idx][w] = Math.max(take,notTake);
    }

    public static int UnboundedKnapsack(int n,int w,int[] wt,int[] val){

        int[][] dp = new int[n][w+1];
        for(int[] row:dp){
            Arrays.fill(row,-1);
        }
        return helper(wt, val, n-1, w,dp);
    }

    public static int UnboundedKnapsack2(int n ,int w,int[] wt,int[] val){
        int[][] dp = new int[n][w+1];
        for(int i =wt[0];i<=w;i++){
            dp[0][i] =(i/wt[0])*val[0];
        }
        for(int i=1;i<n;i++){
            for(int j = 0;j<=w;j++){
                int notTake = dp[i-1][j];
                int take =Integer.MIN_VALUE;
                if(wt[i]<=j){
                    take = val[i]+ dp[i][j-wt[i]];
                }
                dp[i][j] = Math.max(take,notTake);
            }
            
        }
        return dp[n-1][w];
    }
    public static void main(String[] args) {
        int n =3;
        int w =8;
        int[] wt ={2,4,6};
        int[] val ={5,11,13};
        System.out.println(UnboundedKnapsack(n, w, wt, val));
        System.out.println(UnboundedKnapsack2(n, w, wt, val));
    }
    
}
