package step15;

import java.util.ArrayList;

public class dfs {
    public static void dfsTraversal(int node,boolean vis[],ArrayList<ArrayList<Integer>> adj,ArrayList<Integer> ls){
        vis[node] = true;
        ls.add(node);
        for(Integer it : adj.get(node)){
            if(vis[it]==false){
                dfsTraversal(it, vis, adj, ls);
            }
        }
    }

    public static ArrayList<Integer> dfsOfGraph(int V,ArrayList<ArrayList<Integer>> adj){
        boolean vis[] = new boolean[V+1];
        vis[0] =true;
        ArrayList<Integer> ls = new ArrayList<>();
        dfsTraversal(0, vis, adj, ls);
        return ls;

    }
}
