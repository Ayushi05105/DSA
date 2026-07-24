package graph;
import java.util.*;

class Node{
        int first;
        int second;
        public Node(int first,int second){
            this.first = first;
            this.second = second;
        }
    }

public class cycleDetection {
    
    public static boolean cycle(ArrayList<ArrayList<Integer>> adj,int s,boolean vis[],int[] parent){
        Queue<Node> q = new LinkedList<>();
        q.add(new Node(s,-1));
        vis[s] = true;
        while(!q.isEmpty()){
            int node = q.peek().first;
            int par = q.peek().second;
            q.remove();

            for(Integer i : adj.get(node)){
            if(vis[i] = false){
            q.add(new Node(i,node));
            vis[i] = true;
            }
            else if(par !=i){
                return true;
            }
        }  
    }
    return false;
    }
    public static boolean isCycle(ArrayList<ArrayList<Integer>> adj,int V){
        boolean[] vis = new boolean[V];
        Arrays.fill(vis,false);
        int[] parent = new int[V];
        Arrays.fill(parent,-1);
        for(int i =0;i<V;i++){
            if(vis[i]==false){
                if(cycle(adj, i, vis, parent)) return true;
            }
        }
        return false;

    }
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            adj.add(new ArrayList < > ());
        }
        adj.get(1).add(2);
        adj.get(2).add(1);
        adj.get(2).add(3);
        adj.get(3).add(2);
        System.out.println(isCycle(adj,4 ));
    }


    
}
