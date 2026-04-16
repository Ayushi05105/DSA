package step15.ShortestPathAlgorithm;

import java.util.Arrays;
import java.util.PriorityQueue;

public class shortestDistinBimaryMaze {

    public static class Node{
        int dist, row,col;
        Node(int d ,int r,int c){
            dist = d;
            row = r;
            col = c;
        }

    }

    public static int shortest_Distance_Maze(int[][] grid,int[] src ,int[] dest){
        int n = grid.length;
        int m = grid[0].length;
        int[][] dist = new int[n][m];
        for(int[] row : dist){
            Arrays.fill(row,(int)1e9);
        }

        PriorityQueue<Node> pq = new PriorityQueue<>((a,b) -> a.dist-b.dist);
        
        dist[0][0] = grid[0][0]; 
        pq.add(new Node(grid[0][0],0,0));

        int[] dr ={-1,0,1,0};
        int[] dc ={0,1,0,-1};

        while(!pq.isEmpty()){
            Node curr = pq.poll();
            int d = curr.dist;
            int r = curr.row;
            int c = curr.col;

            if(r == n-1 && c==m-1){
                return d;
            }

            for(int i =0;i<4;i++){
                int nr = r + dr[i];
                int nc = c + dc[i];

                if(nr >= 0 && nr <n && nc >=0 && nc<m){
                    int newDist = d + grid[nr][nc];

                    if(newDist < dist[nr][nc]){
                        dist[nr][nc] = newDist;
                        pq.add(new Node(newDist,nr,nc));
                    }
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] src = {0, 1};
        int[] dest = {2, 2};

        // Define the grid
        int[][] grid = {
            {1, 1, 1, 1},
            {1, 1, 0, 1},
            {1, 1, 1, 1},
            {1, 1, 0, 0},
            {1, 0, 0, 1}
        };
        int ans = shortest_Distance_Maze(grid,src,dest);
        System.out.println(ans);
    }
    
}
