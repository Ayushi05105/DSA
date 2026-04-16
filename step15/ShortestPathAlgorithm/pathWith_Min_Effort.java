package step15.ShortestPathAlgorithm;
import java.util.*;
public class pathWith_Min_Effort {

    public static class Tuple{
        int dist;
        int row;
        int col;
        public Tuple(int dist,int row,int col){
            this.dist = dist;
            this.row = row;
            this.col = col;
        }
    }

    public static int MinHeight(int[][] height){
        int n = height.length;
        int m = height[0].length;
        int[][] dist = new int[n][m];
        for(int[] row : dist){
            Arrays.fill(row,(int)1e9);
        }
        dist[0][0] = 0;
        PriorityQueue<Tuple> pq = new PriorityQueue<>((a,b)-> a.dist-b.dist);
        pq.add(new Tuple(0,0,0));
        int[] dr = {-1,0,1,0};
        int[] dc = {0,1,0,-1};
        while(!pq.isEmpty()){
            Tuple curr = pq.poll();
            int diff = curr.dist;
            int r = curr.row;
            int c = curr.col;
            if(r == n-1 && c == m-1) return diff;

            for(int i =0;i<4;i++){
                int nr = r + dr[i];
                int nc = c + dc[i];

                if(nr >=0 && nr<n && nc >=0 && nc <m){
                    int newEffort = Math.max(Math.abs(height[r][c]-height[nr][nc]) , diff);

                    if(newEffort < dist[nr][nc]){
                        dist[nr][nc] = newEffort;
                        pq.add(new Tuple(newEffort,nr,nc));
                    }
                }
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[][] height = {{1,2,2},{3,8,2},{5,3,5}};
        System.out.println(MinHeight(height));
    }
    
}
