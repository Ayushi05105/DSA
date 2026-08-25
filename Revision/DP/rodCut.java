package Revision.DP;

import java.util.*;

public class rodCut {

    // recursion

    public static int helper2(int[] cuts, int i, int j) {
        int mini = Integer.MAX_VALUE;
        int total = 0;

        if (i > j)
            return 0;
        for (int k = i; k <= j; k++) {
            int cost = cuts[j + 1] - cuts[i - 1];
            int left = helper2(cuts, i, k - 1);
            int right = helper2(cuts, k + 1, j);
            total = cost + left + right;
            mini = Math.min(mini, total);
        }
        return mini;
    }

    public static int rodCutting2(int[] cuts, int n) {
        int[] arr = new int[cuts.length + 2];

        arr[0] = 0;
        arr[arr.length - 1] = n;
        for (int i = 0; i < cuts.length; i++) {
            arr[i + 1] = cuts[i];
        }
        Arrays.sort(arr);
        return helper2(arr, 1, arr.length - 2);
    }

    // memoisation

    public static int helper(int[] cuts, int i, int j, int[][] dp) {
        int mini = Integer.MAX_VALUE;
        int total = 0;
        if (dp[i][j] != -1) {
            return dp[i][j];
        }
        if (i > j)
            return 0;
        for (int k = i; k <= j; k++) {
            int cost = cuts[j + 1] - cuts[i - 1];
            int left = helper(cuts, i, k - 1, dp);
            int right = helper(cuts, k + 1, j, dp);
            total = cost + left + right;
            mini = Math.min(mini, total);
        }
        return dp[i][j] = mini;
    }

    public static int rodCutting(int[] cuts, int n) {
        int[] arr = new int[cuts.length + 2];
        int[][] dp = new int[arr.length][arr.length];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        arr[0] = 0;
        arr[arr.length - 1] = n;
        for (int i = 0; i < cuts.length; i++) {
            arr[i + 1] = cuts[i];
        }
        Arrays.sort(arr);
        return helper(arr, 1, arr.length - 2, dp);
    }

    // tabulation
    public static int rodCutting3(int[] cuts, int n) {
        int[] arr = new int[cuts.length + 2];
        arr[0] = 0;
        arr[arr.length - 1] = n;
        for(int i = 0; i < cuts.length; i++) {
            arr[i + 1] = cuts[i];
        }
        Arrays.sort(arr);
        int[][] dp = new int[arr.length][arr.length];
        
        for (int i = arr.length-2; i >= 1; i--) {
            for (int j = 1; j <= arr.length-2; j++) {
                if (i > j)
                    continue;
                int total =0;
                int mini = Integer.MAX_VALUE;
                for (int k = i; k <= j; k++) {
                    int cost = arr[j + 1] - arr[i - 1];
                    int left = dp[i][k - 1];
                    int right = dp[k + 1][j];
                    total = cost + left + right;
                    mini =  Math.min(mini, total);
                }
                dp[i][j] = mini;
            }
        }
        return dp[1][arr.length-2];
    }

    public static void main(String[] args) {
        int[] cuts = { 1, 3, 4, 5 };
        System.out.println(rodCutting2(cuts, 7));
        System.out.println(rodCutting(cuts, 7));
        System.out.println(rodCutting3(cuts, 7));

    }

}
