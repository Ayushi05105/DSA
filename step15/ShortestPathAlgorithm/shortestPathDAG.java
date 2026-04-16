package step15.ShortestPathAlgorithm;
import java.util.*;

public class shortestPathDAG {

    public static void topoSort(int node,List<List<int[]>> adj ,boolean[] vis,Stack<Integer> st ){
        vis[node] = true;
        for(int[] num:adj.get(node)){
            if(!vis[num[0]]){
                topoSort(num[0], adj, vis, st);
            }
        }
        st.push(node);
    }
    public static int[] shortestpath(int[][] edges,int n ,int m){
        List<List<int[]>> adj = new ArrayList<>();
        for(int i =0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int i =0;i<m;i++){
            int u = edges[i][0];
            int v = edges[i][1];
            int wt = edges[i][2];
            adj.get(u).add(new int[]{v,wt});
            
        }
        boolean[] vis = new boolean[n];
        Stack<Integer> st = new Stack<>();
        for(int i =0;i<n;i++){
            if(!vis[i]){
                topoSort(i, adj, vis, st);
            }
        }
        int[] dist = new int[n];
        Arrays.fill(dist,(int)1e9);
        dist[0] =0;
        while(!st.isEmpty()){
           int node = st.pop();
           if(dist[node] != (int)1e9){
            for(int[] num: adj.get(node)){
                int v = num[0];
                int wt = num[1];
                if(dist[node]+wt < dist[v]){
                    dist[v] = dist[node]+wt;
                }
            }
           }
        }
        for(int i =0;i<n;i++){
            if(dist[i]==(int)1e9){
                dist[i] = -1;
            }
        }
        return dist;
    }

    public static void main(String[] args) {
        int N = 6, M = 7;
        int[][] edges = {
            {0,1,2}, {0,4,1}, {4,5,4},
            {4,2,2}, {1,2,3}, {2,3,6}, {5,3,1}
        };
        int[] res = shortestpath(edges, N, M);
        for(int num : res){
        System.out.print(num+" ");
        }
    }
    
}
