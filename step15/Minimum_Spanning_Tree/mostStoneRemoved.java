package step15.Minimum_Spanning_Tree;

import java.util.HashSet;
import java.util.Set;

public class mostStoneRemoved {

        public static int findParent(int[] parent,int x){
        if(parent[x] != x){
            parent[x] = findParent(parent,parent[x]);
        }
        return parent[x];
    }

    public static void union(int[] parent,int[] rank, int x,int y){
        int px = findParent(parent,x);
        int py = findParent(parent,y);
        if(px == py) return;
        if(rank[px]< rank[py]){
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
    public static int removeStones(int[][] stones) {
        int n = stones.length;
        int[] parent = new int[n];
        int[] rank = new int[n];

        for(int i =0;i<n;i++){
            parent[i] = i;
        }
        for(int i =0;i<n;i++){
            for(int j =i+1;j<n;j++){
                if(stones[i][0] == stones[j][0] || stones[i][1] == stones[j][1]){
                    union(parent,rank, i,j);
                }
            }
        }
        Set<Integer> set = new HashSet<>();
        for(int i =0;i<n;i++){
            set.add(findParent(parent,i));
        }
        return n - set.size();
    }

    public static void main(String[] args) {
        int[][] stones ={{0, 0}, {0, 1}, {1, 0}, {1, 2}, {2, 1}, {2, 2}};

        System.out.println(removeStones(stones));
    }
    
}
