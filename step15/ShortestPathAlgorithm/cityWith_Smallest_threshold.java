package step15.ShortestPathAlgorithm;

public class cityWith_Smallest_threshold {

    public static int Smallest_threshold(int n ,int m , int[][] edge,int threshold){
        int[][] dist = new int[n][n];
        for(int i =0;i<n;i++){
            for(int j =0;j<n;j++){
                dist[i][j] = (int)1e9;
            }
        }

        for(int i =0;i<m;i++){
            int u = edge[i][0];
            int v = edge[i][1];
            int wt = edge[i][2];
            dist[u][v] = wt;
            dist[v][u] = wt;

        }
        for(int i =0;i<n;i++) dist[i][i] =0;

        for(int k =0;k<n;k++){
            for(int i =0;i<n;i++){
                for(int j =0;j<n;j++){
                    if(dist[i][k] != (int)1e9 && dist[k][j] != (int)1e9){
                    dist[i][j] = Math.min(dist[i][j],dist[i][k] + dist[k][j]);
                    }
                }
            }
        }
        int MaxCity = n;
        int city =-1;
        for(int i =0;i<n;i++){
            int cnt =0;
            for(int j =0;j<n;j++){
                if(i != j && dist[i][j] <= threshold){
                    cnt++;
                }
            }
            if(cnt <= MaxCity){
                MaxCity = cnt;
                city = i;
            }

        }
        return city;
    }

    public static void main(String[] args) {
        int n =4;
        int m =4;
        int threshold = 4;
        int[][] edge = {{0, 1, 3}, {1, 2, 1}, {1, 3, 4}, {2, 3, 1}};
        System.out.println(Smallest_threshold(n, m, edge, threshold));
    }
    
}
