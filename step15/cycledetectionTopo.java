package step15;

import java.util.*;

public class cycledetectionTopo {

    public static boolean check(int node,ArrayList<ArrayList<Integer>> adj,int[] vis,int[] dfsVis){
        vis[node] = 1;
        dfsVis[node] = 1;
        for(int it: adj.get(node)){
            if(vis[it]==0){
                if(check(it, adj, vis, dfsVis)==true) return true;
                else if(dfsVis[it]==1) return true;
            }
            
        }
        dfsVis[node] = 0;
        return false;
    }

    public static boolean cycle(int N,ArrayList<ArrayList<Integer>> adj){
        int[] vis = new int[N];
        int[] dfsVis = new int[N];
        for(int i =0;i<N;i++){
            if(vis[i]==0){
                if(check(i,adj,vis,dfsVis)){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        int V =11;
        for(int i = 0; i < V; i++){
          adj.add(new ArrayList<>());
         }
        adj.get(1).add(2);
        adj.get(2).add(3);
        adj.get(3).add(4);
        adj.get(4).add(5);
        adj.get(5).add(6);
        adj.get(3).add(7);
        adj.get(7).add(5);
        adj.get(8).add(2);
        adj.get(8).add(9);
        adj.get(9).add(10);
        adj.get(10).add(8);
        System.out.println(cycle(V, adj));
    }
    
}
