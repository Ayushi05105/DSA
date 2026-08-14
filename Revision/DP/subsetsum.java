package Revision.DP;

import java.util.*;

public class subsetsum {
    public static boolean helper(int[] arr, int idx, int k) {
        boolean[][] dp = new boolean[idx][k + 1];
       
        for(int i =0;i<idx;i++){
            dp[i][0] = true;
        }
        if(arr[0]<=k){
            dp[0][arr[0]] = true;
        }
        for (int i = 0; i < idx; i++) {
            for (int j = 0; j <= k; j++) {

                boolean notPick = dp[idx + 1][k];
                boolean pick = false;
                if (arr[idx] <= k) {
                    pick = dp[idx + 1][k - arr[idx]];
                }
                dp[idx][k] = pick||notPick;
            }
        }
        return dp[idx-1][k];
    }

    public static boolean SubsetSum(int[] arr, int k) {
        int n = arr.length;
        int[][] dp = new int[n][k + 1];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        return helper(arr, n, k);

    }
// space optimisation
    public static boolean SubsetSum2(int n ,int[] arr,int k) {
        boolean[] prev= new boolean[k + 1];
       prev[0] = true;
        
        if(arr[0]<=k){
            prev[arr[0]] = true;
        }
        for (int i = 0; i < n; i++) {
            boolean[] curr = new boolean[k+1];
            curr[0] = true;
            for (int j = 0; j <= k; j++) {

                boolean notPick = prev[k];
                boolean pick = false;
                if (arr[n] <= k) {
                    pick = prev[k - arr[i]];
                }
                curr[k] = pick||notPick;
            }
            prev = curr;
        }
        return prev[k];
    }

    public static void main(String[] args) {
        int[] arr = { 4, 3, 5, 5 };
        int k = 6;
       // System.out.println(SubsetSum(arr, k));
        System.out.println(SubsetSum2(0, arr, k));
    }

}
