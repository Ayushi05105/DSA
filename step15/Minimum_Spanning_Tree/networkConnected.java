package step15.Minimum_Spanning_Tree;

import java.util.HashSet;
import java.util.Set;

public class networkConnected {

    public static int findParent(int[] parent ,int x){
        if(parent[x] != x) {
            parent[x] = findParent(parent, parent[x]);
        }
        return parent[x];
    }

    public static void union(int[] parent,int[] rank,int x ,int y){
        int px = findParent(parent, x);
        int py = findParent(parent, y);
        if(px == py) return ;
        if(rank[px] < rank[py]){
            parent[px] = py;
        }
        else if(rank[px] > rank[py]){
            parent[py] = px;
        }
        else{
            parent[py] = px;
            rank[px]++;
        }
    }

    public static int makeConnection(int n , int[][] connection){
        if(connection.length < n-1) return -1;
        int[] parent = new int[n];
        int[] rank = new int[n];

        for(int i =0;i<n;i++){
            parent[i] = i;
        }
        for(int[] arr : connection){
            union(parent, rank, arr[0], arr[1]);
        }
        Set<Integer> component = new HashSet<>();

        for(int i =0;i<n;i++){
            component.add(findParent(parent, i));
        }
        return component.size()-1;

    }

    public static void main(String[] args) {
        int[][] connections = {{0,1},{0,2},{1,2}};
        int n = 4;
        System.out.println(makeConnection(n, connections));
    }
    


    
}
