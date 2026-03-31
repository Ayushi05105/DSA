package Step16.twoDimention;

import java.util.Arrays;

public class minPathSum {

    // RECURSION APPROACH

    public static int helper(int i,int j, int[][] grid){
        if(i==0 && j==0) return grid[0][0];
        if(i<0 || j <0) return Integer.MAX_VALUE;
       
        int left =  helper(i-1, j, grid);
        int bottom = helper(i, j-1, grid);
        int res1 = Integer.MAX_VALUE;
        int res2 = Integer.MAX_VALUE;
        if(left != Integer.MAX_VALUE){
            res1 = grid[i][j] + left;
        }
        if(bottom != Integer.MAX_VALUE){
            res2 = grid[i][j] + bottom;
        }
        return Math.min(res1,res2);
           
    }

    public static int minPath(int[][] grid){
        int n = grid.length;
        int m = grid[0].length;
        return helper(n-1,m-1, grid);
       
    }

    //MEMOIZATION

    public static int helper2(int i,int j,int[][] grid,int[][] dp){
        if(i==0 && j==0) return grid[0][0];
        if(i<0 || j<0) return (int) 1e9;
        if(dp[i][j] !=-1) return dp[i][j];
        int up = grid[i][j] + helper2(i-1, j, grid, dp);
        int left = grid[i][j] + helper2(i, j-1, grid, dp);
        dp[i][j] = Math.min(up,left);
        return dp[i][j];
    }
    public static int memoization(int[][] grid){
        int n = grid.length;
        int m = grid[0].length;
        int[][] dp = new int[n][m];
        for(int[] num:dp){
            Arrays.fill(num,-1);
        }
        return helper2(n-1, m-1, grid, dp);
    }

    //TABULATION
    public static int tabulation(int[][] grid){
        int m = grid.length;
        int n = grid[0].length;
        int[][] dp = new int[m][n];
        for(int i =0;i<m;i++){
            for(int j= 0;j<n;j++){
                if(i==0 && j==0){
                     dp[i][j] = grid[i][j];
                }
                else{
                    int up = grid[i][j];
                    if(i>0) up+=dp[i-1][j];
                    else up += (int)1e9;

                    int left = grid[i][j];
                    if(j>0) left += dp[i][j-1];
                    else left +=(int) 1e9;

                    dp[i][j] = Math.min(up,left);

                }
            }
        }
        return dp[m-1][n-1];
    }
    
    public static void main(String[] args) {
        int[][] grid ={{1,3,1},
                        {1,5,1},
                       {4,2,1}};
        
        
        System.out.println(minPath(grid));
        System.out.println(memoization(grid));
        System.out.println(tabulation( grid));

    }
}
