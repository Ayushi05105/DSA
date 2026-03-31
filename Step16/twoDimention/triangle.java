package Step16.twoDimention;

import java.util.Arrays;

public class triangle {

    // RECURSION
    public static int helper(int i,int j,int n,int[][] grid){
        
        if(i==n-1) return grid[n-1][j];
        int down = grid[i][j] + helper(i+1, j,n, grid);
        int digonal = grid[i][j] + helper(i+1, j+1,n, grid);
        return Math.min(down,digonal);
    }
    public static int recursion(int[][] grid){
        int n = grid.length;
        return helper(0, 0,n, grid);
    }


    //MEMOIZATION


    public static int helper2(int i,int j,int n,int[][] grid,int[][] dp){
        
        if(i==n-1) return grid[n-1][j];
        int down = grid[i][j] + helper2(i+1, j,n, grid,dp);
        int digonal = grid[i][j] + helper2(i+1, j+1,n, grid,dp);
        return dp[i][j] = Math.min(down,digonal);
    }
    public static int memoization(int[][] grid){
        int n = grid.length;
        int[][] dp = new int[n][n];
        for(int[] row:dp){
            Arrays.fill(row,-1);
        }
        return helper2(0, 0,n, grid,dp);
    }

    public static void main(String[] args) {
        
        int[][] grid = {{2},{3,4},{6,5,7},{4,1,8,3}};
        System.out.println(recursion(grid));
        System.out.println(memoization(grid));
    }
    
}
