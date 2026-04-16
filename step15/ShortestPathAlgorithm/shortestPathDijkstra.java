package step15.ShortestPathAlgorithm;
import java.util.*;
public class shortestPathDijkstra {

    public static List<Integer> shortestPath(int V,List<List<int[]>> adj,int src , int dest){
        int[] dist = new int[V];
        int[] parent = new int[V];
        Arrays.fill(dist,(int)1e9);
        for(int i =0;i<V;i++){
            parent[i] = i;
        }
        dist[src] = 0;
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a->a[0]));
        pq.add(new int[]{0,src});

        while(!pq.isEmpty()){
            int[] curr = pq.poll();
            int d = curr[0];
            int node = curr[1];
            if(d > dist[node]) continue;
            for(int[] num : adj.get(node)){
                int v = num[0];
                int wt = num[1];
                if(dist[node]+wt < dist[v]){
                    dist[v] = dist[node] + wt;
                    parent[v] = node;
                    pq.add(new int[]{dist[v],v});
                }

            }
        }
        List<Integer> path = new ArrayList<>();
        int node = dest;
        while(parent[node] != node){
            path.add(node);
            node = parent[node];
        }
        path.add(src);
        Collections.reverse(path);
        return path;
    }

    public static void main(String[] args) {
        int V = 5;
        List<List<int[]>> adj = new ArrayList<>();

        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        adj.get(0).add(new int[]{1, 2});
        adj.get(0).add(new int[]{2, 4});

        adj.get(1).add(new int[]{2, 1});
        adj.get(1).add(new int[]{3, 7});

        adj.get(2).add(new int[]{4, 3});

        adj.get(3).add(new int[]{4, 1});

        int src = 0;
        int dest = 4;

        List<Integer> path = shortestPath(V, adj, src, dest);

        if (path.isEmpty()) {
            System.out.println("No path exists");
        } else {
            System.out.println("Shortest Path: " + path);
        }
    }
    
}
