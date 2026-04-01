package Step16.twoDimention;

public class MaxFallingPath {


    public static int helper(int i ,int j ,int[][] grid){
        int m = grid[0].length;
        if(j<0 || j>=m) return (int) Integer.MIN_VALUE;
        if(i ==0) return grid[0][j];

        int up = grid[i][j] + helper(i-1,j,grid);
        int dr = grid[i][j] + helper(i-1,j+1,grid);
        int dl = grid[i][j] + helper(i-1,j-1,grid);
        return Math.max(up,Math.max(dr,dl));
    }

    public static int recursion(int[][] grid){
        int n = grid.length;
        int m = grid[0].length;
        return helper(n-1, m-1, grid);
    }


    public static int memoization(int i,int j,int[][] grid,int[][] dp){
        if(i==0 && j ==0) return grid[0][0];
        if(i<0 || j<0) return (int)1e9;
        if(dp[i][j] != -1) return dp[i][j];
        int up = grid[i][j] + memoization(i-1,j,grid,dp);
        int dr = grid[i][j] + memoization(i-1,j+1,grid,dp);
        int dl = grid[i][j] + memoization(i-1,j-1,grid,dp);
        return dp[i][j] = Math.max(up,Math.max(dr,dl));
        
    }
    public static void main(String[] args) {
        int[][] grid = {{1,2,10,4},{100,3,2,1},{1,1,20,2},{1,2,2,1}};
        System.out.println(recursion(grid));

    }
    
}
