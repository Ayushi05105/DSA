package graph;
import java.util.*;

public class belmannFord {
    

    public static int[] belmann_Ford(int V,ArrayList<ArrayList<Integer>> adj,int src){
        int[] dist = new int[V];
        for(int i=0;i<V;i++){
            dist[i] = (int)1e8;
        }
        dist[src] =0;

        for(int i=0;i<V;i++){
            for(ArrayList<Integer> it:adj){
                int u = it.get(0);
                int v = it.get(1);
                int w = it.get(2);
                if(dist[u] !=1e9 && dist[u]+w < dist[v]){
                    dist[v] = dist[u]+w;
                }
            }
        }

        for(ArrayList<Integer> it:adj){
            int u = it.get(0);
            int v = it.get(1);
            int w = it.get(2);
            if(dist[u] != 1e8 && dist[u]+w<dist[v]){
                int[] temp = new int[1];
                temp[0] =1;
                return temp;
            }
        }
        return dist;


    }

    public static void main(String[] args) {
        int V = 6;
        int src =0;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>(){
            {
             add(new ArrayList<Integer>(Arrays.asList(3, 2, 6)));
                add(new ArrayList<Integer>(Arrays.asList(5, 3, 1)));
                add(new ArrayList<Integer>(Arrays.asList(0, 1, 5)));
                add(new ArrayList<Integer>(Arrays.asList(1, 5, -3)));
                add(new ArrayList<Integer>(Arrays.asList(1, 2, -2)));
                add(new ArrayList<Integer>(Arrays.asList(3, 4, -2)));
                add(new ArrayList<Integer>(Arrays.asList(2, 4, 3)));
        }
    };
    int[] dist = belmann_Ford(V, adj, src);
    for(int i =0;i<V;i++){
        System.out.print(dist[i]+" ");
    }
    System.out.println();
    }
}
