package step15.ShortestPathAlgorithm;

import java.util.*;

public class dijkstraPQ {

    public static int[] dijkstra(int V ,List<List<int[]>> adj , int src){
        int[] dist = new int[V];
        Arrays.fill(dist,(int)1e9);
        dist[src] = 0;

        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)-> a[0]-b[0]);
        pq.add(new int[]{0,src});

        while(!pq.isEmpty()){
            int[] curr = pq.poll();
            int d = curr[0];
            int node = curr[1];

            if(d > dist[node]) continue;

            for(int[] num:adj.get(node)){
                int v = num[0];
                int wt = num[1];
                if(dist[node] + wt < dist[v]){
                    dist[v] = dist[node] + wt;
                    pq.add(new int[]{dist[v],v});
                }
            }

        }
        return dist;
    }

    public static void main(String[] args) {
         int V = 6;

        List<List<int[]>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) adj.add(new ArrayList<>());

       
        int[][] edges = {
            {0,1,2}, {0,4,1}, {4,5,4},
            {4,2,2}, {1,2,3}, {2,3,6}, {5,3,1}
        };

         for (int[] e : edges) {
        adj.get(e[0]).add(new int[]{e[1], e[2]});
         }
        int[] res = dijkstra(V, adj, 0);

        for(int val :res){
            System.out.print(val+" ");
        }
    }
    
}
