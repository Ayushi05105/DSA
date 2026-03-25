package step15;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class bfs {
    public static ArrayList<Integer> bfsOfGraph(int V,ArrayList<ArrayList<Integer>> adj){
        ArrayList<Integer> bfs = new ArrayList<>();
        boolean visited[] = new boolean[V];
        Queue<Integer> q = new LinkedList<>();
        q.add(0);
        visited[0] = true;
        while(!q.isEmpty()){
            Integer node = q.poll();
            bfs.add(node);
            
            for(Integer num:adj.get(node)){
                if(visited[num] == false){
                    visited[num] = true;
                    q.add(num);
                }

            }
        }
        return bfs;

    }
    public static void main(String[] args) {
    int V = 6;

    ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

    for(int i = 0; i < V; i++){
        adj.add(new ArrayList<>());
    }

    
    adj.get(0).add(1);
    adj.get(1).add(0);

    adj.get(0).add(2);
    adj.get(2).add(0);

    adj.get(1).add(3);
    adj.get(3).add(1);

    adj.get(2).add(4);
    adj.get(4).add(2);

    adj.get(3).add(5);
    adj.get(5).add(3);

    ArrayList<Integer> result = bfsOfGraph(V, adj);

    System.out.println("BFS Traversal:");
    for(int node : result){
        System.out.print(node + " ");
    }
}
    
}
