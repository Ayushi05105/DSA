package graph;

import java.util.*;

class Pair{
    int first;
    int second;
    Pair(int f,int s){
        this.first = f;
        this.second = s;
    }
}



public class shortesPathDAG {

    public static void topoSort(int node,ArrayList<ArrayList<Pair>> adj,int[] vis,Stack<Integer> st){
    vis[node] = 1;
    for(int i =0;i<adj.get(node).size();i++){
        int v = adj.get(node).get(i).first;
        if(vis[v]==0){
            topoSort(v,adj,vis,st);
        }
    }
    st.add(node);
}

    public static int[] DAG(int n,int[][] edges){
        ArrayList<ArrayList<Pair>> adj = new ArrayList<>();
        for(int i =0;i<n;i++){
            ArrayList<Pair> temp = new ArrayList<>();
            adj.add(temp);
        }

        for(int i =0;i<edges.length;i++){
            int u = edges[i][0];
            int v = edges[i][1];
            int wt = edges[i][2];
            adj.get(u).add(new Pair(v,wt));
        }
        int[] vis = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i =0;i<n;i++){
            if(vis[i]==0){
                topoSort(i,adj,vis,st);
            }
        }
        int[] dist = new int[n];
        for(int i =0;i<n;i++){
            dist[i] = (int)(1e9);
        }
        dist[0] = 0;
        while(!st.isEmpty()){
            int curr = st.peek();
            st.pop();
            for(int i =0;i<adj.get(curr).size();i++){
                int v = adj.get(curr).get(i).first;
                int wt = adj.get(curr).get(i).second;
                if(dist[curr]+wt <=dist[v]){
                    dist[v] = wt +dist[curr];
                }
            }
        }
        return dist;
    }
    public static void main(String[] args) {
        int n =6;
        int m =7;
        int[][] edges = {
            {0,1,2}, {0,4,1}, {4,5,4},
            {4,2,2}, {1,2,3}, {2,3,6}, {5,3,1}
        };
        int[] ans = DAG(n, edges);
        for(int num:ans){
            System.out.print(num+" ");
        }

    }
    
}
