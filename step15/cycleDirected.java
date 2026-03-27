package step15;
import java.util.*;

public class cycleDirected {

    public static boolean dfsCheck(int node,ArrayList<ArrayList<Integer>> adj,int[] vis,int[] pathVis){
        vis[node]=1;
        pathVis[node] = 1;
        for(int i :adj.get(node)){
            if(vis[i]==0){
                if(dfsCheck(i, adj, vis, pathVis)==true){
                    return true;
                }
            }
            else if(pathVis[i]==1){
                return true;
            }
        }
        pathVis[node]=0;
        return false;
    }

    public static boolean isCycle(int V , ArrayList<ArrayList<Integer>> adj){
        int[] vis = new int[V];
        int pathVis[] = new int[V];
        for(int i =0;i<V;i++){
            if(vis[i]==0){
                if(dfsCheck(i, adj, vis, pathVis)==true) return true;
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
        
        System.out.println(isCycle(V, adj));


        
    }
    
}
