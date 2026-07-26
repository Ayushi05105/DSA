package graph;
import java.util.*;
public class topoSortDFS {

    public static void dfs(int node,int[] vis,Stack<Integer> st,ArrayList<ArrayList<Integer>> adj){
        vis[node] =1;
        for(int i:adj.get(node)){
            if(vis[i]==0){
                dfs(i,vis,st,adj);
            }
            
        }
        st.push(node);

    }

    public static int[] topoSort(int V , ArrayList<ArrayList<Integer>> adj){
        Stack<Integer> st = new Stack<>();
        int[] vis = new int[V];
        for(int i =0;i<V;i++){
            if(vis[i]==0){
                dfs(i,vis,st,adj);
            }
        }
        int[] ans = new int[V];
        int i =0;
        while(!st.isEmpty()){
            ans[i++] =st.peek();
            st.pop();
        }
        return ans;
    }
    public static void main(String[] args) {
        int V = 6;

    ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

    for(int i = 0; i < V; i++){
        adj.add(new ArrayList<>());
    }

    adj.get(5).add(2);
    adj.get(5).add(0);
    adj.get(4).add(0);
    adj.get(4).add(1);
    adj.get(2).add(3);
    adj.get(3).add(1);

    int[] ans = topoSort(V, adj);
    for(int x:ans){
        System.out.print(x+" ");
    }
    }
    
}
