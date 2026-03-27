package step15;
import java.util.*;
public class kahnAlgorithm {
    public static int[] topoSort(int V , ArrayList<ArrayList<Integer>> adj){

        int[] indegree = new int[V];
        for(int i =0;i<V;i++){
            for(int it:adj.get(i)){
                indegree[it]++;
            }
        }
        Queue<Integer> q = new LinkedList<>();
        for(int i =0;i<V;i++){
            if(indegree[i]==0){
                q.add(i);
            }
        }
        int[] top = new int[V];
        int i =0;
        while(!q.isEmpty()){
            int node = q.peek();
            q.remove();
            top[i++] = node;
            for(int it:adj.get(node)){
                indegree[it]--;
                if(indegree[it]==0){
                    q.add(it);
                }
            }
        }
        return top;
    }
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        int V =6;
        for(int i =0;i<V;i++){
            adj.add(new ArrayList<>());
        }
        adj.get(5).add(0);
        adj.get(5).add(2);
        adj.get(2).add(3);
        adj.get(3).add(1);
        adj.get(4).add(1);
        adj.get(4).add(0);
        System.out.println(Arrays.toString(topoSort(V, adj)));

    }
    
}
