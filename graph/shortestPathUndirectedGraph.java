package graph;

import java.util.*;

public class shortestPathUndirectedGraph {

    public static int[] shortestPath(int[][] edges,int n,int m,int src){
        List<List<Integer>> adj = new ArrayList<>();
        for(int i =0;i<n;i++){
            adj.add(new ArrayList<>());
        }

        for(int[] edge:edges){
            adj.get(edge[0]).add(edge[1]);
            adj.get(edge[1]).add(edge[0]);
        }
        int[] dist = new int[n];
        Arrays.fill(dist,(int) 1e9);
        dist[src] =0;
        Queue<Integer> q = new LinkedList<>();
        q.add(src);

        while(!q.isEmpty()){
            int curr = q.poll();

            for(int num:adj.get(curr)){
                if(dist[curr]+1 < dist[num]){
                    dist[num] = dist[curr]+1;
                    q.add(num);
                }
            }
        }
        for(int i =0;i<n;i++){
            if(dist[i]==(int)1e9){
                dist[i]=-1;
            }
        }
        return dist;


    }
    public static void main(String[] args) {
        int n = 9, m = 10;
        int[][] edges = {
            {0, 1}, {0, 3}, {3, 4}, {4, 5}, {5, 6},
            {1, 2}, {2, 6}, {6, 7}, {7, 8}, {6, 8}
        };
        int[] res = shortestPath(edges, n, m, 0);
        for(int i:res){
            System.out.print(i+" ");
        }
    }
    
}
