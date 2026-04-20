package step15.Minimum_Spanning_Tree;
import java.util.*;

public class prims_Algorithm {

    public static class Pair{
        int node;
        int weight;
        Pair(int node,int weight){
            this.node = node;
            this.weight = weight;
        }
    }
    public static int spanningTree(int V , List<List<Pair>> adj){
        boolean[] visited = new boolean[V];
        PriorityQueue<Pair> pq = new PriorityQueue<>((x,y)-> x.weight - y.weight);
        pq.add(new Pair(0,0));

        int sum =0;
        while(!pq.isEmpty()){
            Pair curr = pq.poll();
            int node = curr.node;
            int wt = curr.weight;

            if(visited[node]) continue;
            visited[node] = true;
            sum += wt;

            for(Pair neighbour : adj.get(node)){
                if(!visited[neighbour.node]){
                    pq.add(new Pair(neighbour.node, neighbour.weight));
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
         int V = 3;
        List<List<Pair>> adj = new ArrayList<>();

        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        
        adj.get(0).add(new Pair(1, 2));
        adj.get(1).add(new Pair(0, 2));

        adj.get(0).add(new Pair(2, 3));
        adj.get(2).add(new Pair(0, 3));

        adj.get(1).add(new Pair(2, 1));
        adj.get(2).add(new Pair(1, 1));

        System.out.println(spanningTree(V, adj));

    }
    
}
