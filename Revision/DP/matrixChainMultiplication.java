package Revision.DP;
import java.util.*;

public class matrixChainMultiplication {

    public static int MatrixChain(int[] arr,int i,int j){
        if(i == j) return 0;
        int min = (int)1e9;
        for(int k =i;k<j ;k++){
            int cost1 = MatrixChain(arr, i, k);
            int cost2 = MatrixChain(arr, k+1, j);
            int costMul = arr[i-1] * arr[k] * arr[j];
            int total = cost1 + cost2 + costMul;
            min = Math.min(min,total);
        }
        return min;
    }

    // memoisation

    public static int MatrixChain2(int[] arr,int i,int j, int[][] dp){
     
        if(i==j) return 0;
        int min = (int) 1e9;
        if(dp[i][j] !=-1) return dp[i][j];
        for(int k =i;k<j;k++){
            int cost1 = MatrixChain2(arr, i, k,dp);
            int cost2 = MatrixChain2(arr, k+1, j, dp);
            int costMul = arr[i-1] * arr[k] * arr[j];
            int total = cost1 + cost2 + costMul;
            min = Math.min(min,total);
        }
        return dp[i][j] = min;
    }
    public static void main(String[] args) {
        int[] arr={10,20,30,40,30};
        int n = arr.length;
        int[][] dp = new int[n][n];
        for(int[] row: dp){
            Arrays.fill(row,-1);
        }
        System.out.println(MatrixChain(arr, 1, arr.length-1));
        System.out.println(MatrixChain2(arr, 1, n-1, dp));
    }
    
}
