package graph;
import java.util.*;

public class topoSortBFS {
    public static int[] topoSort(int v,ArrayList<ArrayList<Integer>> adj){
        int[] indegree = new int[v];
        for(int i =0;i<v;i++){
            for(int it:adj.get(i)){
                indegree[it]++;
            }
        }
        Queue<Integer> q = new LinkedList<>();
        for(int i =0;i<v;i++){
            if(indegree[i]==0){
                q.add(i);
            }
        }
        int[] topo = new int[v];
        int i =0;
        while(!q.isEmpty()){
            int curr = q.peek();
            q.remove();
            topo[i++] = curr;

            for(int it:adj.get(curr)){
                indegree[it]--;
                if(indegree[it]==0){
                    q.add(it);
                }
            }
        }
        return topo;
    }
    public static void main(String[] args) {
        int v = 6;

    ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

    for(int i = 0; i <v; i++){
        adj.add(new ArrayList<>());
    }

    adj.get(5).add(2);
    adj.get(5).add(0);
    adj.get(4).add(0);
    adj.get(4).add(1);
    adj.get(2).add(3);
    adj.get(3).add(1);

    int[] ans = topoSort(v, adj);
    for(int x:ans){
        System.out.print(x+" ");
    }
    }
    
}
