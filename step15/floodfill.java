package step15;

import java.util.*;

public class floodfill {
    public static int[][] FloodFills(int sr,int sc,int[][] image,int color){
        int initialColor = image[sr][sc];
        int n = image.length;
        int m = image[0].length;
        if(initialColor == color) return image;
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{sr,sc});
        image[sr][sc] = color;

        int[] dr ={-1,0,1,0};
        int[] dc ={0,1,0,-1};
        while (!q.isEmpty()) {
            int[] cell = q.poll();
            int r = cell[0];
            int c = cell[1];
            for(int i =0;i<4;i++){
                int nr = r+dr[i];
                int nc = c +dc[i];

                if(nr>=0 && nr<n && nc>=0 && nc<m && image[nr][nc] == initialColor){
                    image[nr][nc] = color;
                    q.add(new int[]{nr,nc});
                }
            }

            
        }
        return image;
    }
    public static void main(String[] args) {
        int[][] image ={{1,1,1},{1,1,0},{1,0,1}};
        // int sr = 1;
        // int sc = 1;
        // int color = 2;
        int[][] res = FloodFills(1, 1,image, 2);
        for(int i =0;i<res.length;i++){
            for(int j =0;j<res[0].length;j++){
                System.out.print(res[i][j]+" ");

            }
            System.out.println();
        }
    }
    
}
