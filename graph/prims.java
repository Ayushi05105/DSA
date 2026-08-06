package graph;

import java.util.*;



public class prims {

    static class Pair {
    int node;
    int dist;

    public  Pair(int dist, int node) {
        this.node = node;
        this.dist = dist;
    }
}

    public static int mst(int V, ArrayList<ArrayList<ArrayList<Integer>>> adj) {
        PriorityQueue<Pair> pq = new PriorityQueue<Pair>((x, y) -> x.dist - y.dist);
        int[] vis = new int[V];
        pq.add(new Pair(0, 0));
        int sum = 0;
        while (!pq.isEmpty()) {
            int wt = pq.peek().dist;
            int node = pq.peek().node;
            pq.remove();
            if (vis[node] == 1)
                continue;
            vis[node] = 1;
            sum += wt;

            for (int i = 0; i < adj.get(node).size(); i++) {
                int edge = adj.get(node).get(i).get(1);
                int adjNode = adj.get(node).get(i).get(0);
                if (vis[adjNode] == 0) {
                    pq.add(new Pair(edge, adjNode));
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int V = 5;
        ArrayList<ArrayList<ArrayList<Integer>>> adj = new ArrayList<>();

        int[][] edge = {
                { 0, 1, 2 },
                { 0, 2, 1 },
                { 1, 2, 1 },
                { 2, 3, 1 },
                { 3, 4, 1 },
                { 4, 2, 2 }
        };

        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        for (int i = 0; i < edge.length; i++) {
            int u = edge[i][0];
            int v = edge[i][1];
            int wt = edge[i][2];

            ArrayList<Integer> temp1 = new ArrayList<>();
            temp1.add(v);
            temp1.add(wt);
            adj.get(u).add(temp1);

            ArrayList<Integer> temp2 = new ArrayList<>();
            temp2.add(u);
            temp2.add(wt);
            adj.get(v).add(temp2);
        }

        System.out.println(mst(V, adj));
    }

}
