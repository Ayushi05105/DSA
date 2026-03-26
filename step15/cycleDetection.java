package step15;

import java.util.*;

class node{
    int first;
    int sec;
    public node(int first,int sec){
        this.first = first;
        this.sec = sec;
    }
}

public class cycleDetection {
    public boolean checkForCycle(ArrayList<ArrayList<Integer>> adj,int s,boolean[] vis,int[] parent){
        Queue<node> q = new LinkedList<>();
        q.add(new node(s,-1));
        vis[s] = true;

        while(!q.isEmpty()){
            int source = q.peek().first;
            int parent1 = q.peek().sec;
            q.remove();

            for(int i :adj.get(source)){
                if(vis[i]==false){
                    q.add(new node(i,source));
                    vis[i] = true;
                }
                else if(parent1 != i){
                    return true;
                }
            }
            
        }
        return true;
    }

    public boolean isCycle(int V,ArrayList<ArrayList<Integer>> adj){
        boolean vis[] = new boolean[V];
        Arrays.fill(vis,false);
        int[] parent = new int[V];
        Arrays.fill(parent, -1);
        for(int i =0;i<V;i++){
            if(vis[i]== false){
                if(checkForCycle(adj, i, vis, parent)) return true;
                
            }
        }
        return false;
    }
     public static void main(String[] args)
    {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            adj.add(new ArrayList < > ());
        }
        adj.get(1).add(2);
        adj.get(2).add(1);
        adj.get(2).add(3);
        adj.get(3).add(2);
                
        cycleDetection obj = new cycleDetection();
        boolean ans = obj.isCycle(4, adj);
        if (ans)
            System.out.println("1");    
        else
            System.out.println("0");
    }

    
}
