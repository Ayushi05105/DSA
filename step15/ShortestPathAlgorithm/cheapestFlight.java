package step15.ShortestPathAlgorithm;

import java.util.*;

public class cheapestFlight {

    public static int cheapestFlight_with_k(int n,int[][] flights,int src ,int dst,int k){
        List<List<int[]>> adj = new ArrayList<>();
        for(int i =0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int[] flight: flights){
            adj.get(flight[0]).add(new int[]{flight[1],flight[2]});
        }
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{0,src,0});

        int[] dist = new int[n];
        Arrays.fill(dist,(int)1e9);
        dist[src] = 0;

        while(!q.isEmpty()){
            int[] curr = q.poll();
            int stop = curr[0];
            int node = curr[1];
            int cost = curr[2];
            for(int[] adjNode:adj.get(node)){
                int next = adjNode[0];
                int wt = adjNode[1];

                if(stop > k) continue;

                if(cost + wt < dist[next] && stop<=k ){
                    dist[next] = cost + wt;
                    q.offer(new int[]{stop+1,next,cost+wt});
                }
            }
        }
        if(dist[dst] == (int)1e9){
            return -1;
        }
        return dist[dst];

    }

    public static void main(String[] args) {
        int n = 4, src = 0, dst = 3, k = 1;

        
        int[][] flights = {{0, 1, 100}, {1, 2, 100}, {2, 0, 100}, {1, 3, 600},
        {2, 3, 200}};
        System.out.println(cheapestFlight_with_k(n, flights, src, dst, k));
    }
    
}
