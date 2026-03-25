package step15;

import java.util.*;

public class countComponent {

    public static void main(String[] args) {
        int V =5;
        int[][] edges ={{0,1},{1,2},{3,4}};
        System.out.println(Count(V, edges));
    }


    public static int Count(int V,int[][] edges){
        List<List<Integer>> adj = new ArrayList<>();
        for(int i=0;i<V;i++){
            adj.add(new ArrayList<>());
        }
        for(int[] e:edges){
            adj.get(e[0]).add(e[1]);
            adj.get(e[1]).add(e[0]);
        }
        boolean[] visited = new boolean[V];
        int component = 0;
        for(int i =0;i<V;i++){
            if(!visited[i]){
                component++;
                Queue<Integer> q = new LinkedList<>();
                q.offer(i);
                visited[i] = true;
                while(!q.isEmpty()){
                    int node = q.poll();
                

                for(int nv : adj.get(node)){
                    if(!visited[nv]){
                        visited[nv] = true;
                        q.offer(nv);
                    }
                }
            }
        }
    }
    
        return component;
    
    }

}

