package LeetCode.Array;

import java.util.Arrays;

public class cuttingArod {

    public static int recursion(int N,int[] price){
       if (N == 0) return 0;

        int maxProfit = 0;

        for (int i = 1; i <= N; i++) {
            maxProfit = Math.max(maxProfit,
                    price[i - 1] + recursion(N - i, price));
        }

        return maxProfit;
    }

    public static int memoization(int N ,int[] price,int[] dp){
        if(N==0) return 0;
        int max = 0;
        if(dp[N] !=-1) return dp[N];
        for(int i =1;i<=N;i++){
            max = Math.max(max,price[i-1] + memoization(N-i, price, dp));
        }
        return dp[N] = max;
    }
     public static void main(String[] args) {
        int[] price = {2, 5, 7, 8};
        int N = 5;
        int[] dp = new int[N];
        Arrays.fill(dp,-1);

        System.out.println(recursion(N, price));
        System.out.println(memoization(N, price, dp)); 
    }

    }
   

    

