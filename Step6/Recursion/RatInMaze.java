package Step6.Recursion;

import java.util.*;

public class RatInMaze {
    public static boolean isSafe(int x,int y,int n,int[][] maze,int[][] visited){
        if(x<0 || x>=n) return false;
        if(y<0 || y>=n) return false;
        if(maze[x][y]==0) return false;
        if(visited[x][y]==1) return false;
        return true;
    }
    public static void helper(int x, int y ,int n ,int[][] maze,int[][] visited,String path,List<String> res){
        if(x==n-1 &&y == n-1){
            res.add(path);
            return;
        }
        visited[x][y] =1;
        if(isSafe(x+1, y, n, maze, visited))
        {
            helper(x+1, y, n, maze, visited, path+"D", res);
        }
        if(isSafe(x, y-1, n, maze, visited)){
            helper(x, y-1, n, maze, visited, path+"L", res);
        }
        if(isSafe(x, y+1, n, maze, visited)){
            helper(x, y+1, n, maze, visited, path+"R", res);
        }
        if(isSafe(x-1, y, n, maze, visited)){
            helper(x-1, y, n, maze, visited, path+"U", res);
        }
        visited[x][y] =0;

    }

    public static void helper2(int x ,int y ,int n,int[][] maze,int[][] visited,String path,List<String> res){
        if(x==n-1 && y == n-1){
            res.add(path);
            return;
        }
        visited[x][y] = 1;
        if(isSafe(x+1, y, n, maze, visited)){
            helper2(x+1, y, n, maze, visited, path+"D", res);
        }
        if(isSafe(x, y+1, n, maze, visited) ){
            helper2(x, y+1, n, maze, visited, path+"R", res);
        } 
        visited[x][y] = 0; 
     }

    public static List<String> RatInAMaze(int n, int[][] maze){
        List<String> res = new ArrayList<>();
        int[][] visited = new int[n][n];
        if(maze[0][0] == 1){
            helper2(0, 0, n, maze, visited, " ", res);
        }
        return res;  
    }
    public static int ShortestPath(int x,int y ,int n, int[][] maze){
        if(x==n-1 && y==n-1){
            return 0;
        }
        if(x>=n || y>=n || maze[x][y]==0){
            return Integer.MAX_VALUE;
        }

        int down = ShortestPath(x+1, y, n, maze);
        int right = ShortestPath(x, y+1, n, maze);
        // int left = ShortestPath(x, y-1, down, maze);
        // int up = ShortestPath(x-1, y, down, maze);
        // int diagonal = ShortestPath(x+1, y+1,n, maze);
        return 1 + Math.min(down,right);
    }
    public static void main(String[] args) {
        // int[][] maze ={{1,0,0,0},
        //                {1,1,0,1},
        //                {1,1,0,0},
        //                {0,1,1,1}};
        int[][] maze ={{1,0,0,0},
                       {1,1,0,1},
                       {0,1,0,0},
                       {1,1,1,1}};               

        int n = maze.length;
        System.out.println(RatInAMaze(n, maze));
        int ans = ShortestPath(0, 0, n, maze);
        if(ans == Integer.MAX_VALUE){
            System.out.println("path");
        }else{
            System.out.println(ans);
        }
        
    }
    
}
