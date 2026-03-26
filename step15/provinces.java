package step15;
import java.util.*;

public class provinces {
    public static void dfs(int node,ArrayList<ArrayList<Integer>> adjLs,int[] vis){
        vis[node] = 1;
        for(Integer it:adjLs.get(node)){
            if(vis[it]==0){
                dfs(it,adjLs,vis);
            }
        }
    }

    public static int NoOfProvinces(int[][] isConnected){
        ArrayList<ArrayList<Integer>> adjLs = new ArrayList<>();
        int V = isConnected.length;
        for(int i =0;i<V;i++){
            adjLs.add(new ArrayList<>());
        }
        for(int i =0;i<V;i++){
            for(int j =0;j<V;j++){
                if(isConnected[i][j]==1 && i!=j){
                    adjLs.get(i).add(j);
                    adjLs.get(j).add(i);
                }
            }
        }
        int count =0;
        int[] vis = new int[V];
        for(int i =0;i<V;i++){
            if(vis[i]==0){
                count++;
                dfs(i, adjLs, vis);
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[][] isConnected = {{1,1,0},{0,1,0},{0,0,1}};
        System.out.println(NoOfProvinces(isConnected));
    }
    
}
