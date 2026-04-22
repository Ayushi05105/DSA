package step15.Minimum_Spanning_Tree;
import java.util.*;
public class DisjointSet {

        ArrayList<Integer> rank = new ArrayList<>();
        ArrayList<Integer> parent = new ArrayList<>();
        ArrayList<Integer> size = new ArrayList<>();
        DisjointSet(int n){
            for(int i =0;i<=n;i++){
                rank.add(0);
                parent.add(i);
                size.add(1);

            }
        }
        
        public  int findUltimateParent(int node){
            if(node == parent.get(node)){
                return node;
            }
            int ulp = findUltimateParent(parent.get(node));
            parent.set(node,ulp);
            return parent.get(node);
        }

        public void unionByRank(int u ,int v){
            int ulp_u = findUltimateParent(u);
            int ulp_v = findUltimateParent(v);
            if(ulp_u == ulp_v) return;
            if(rank.get(ulp_u) < rank.get(ulp_v)){
                 parent.set(ulp_u,ulp_v);
            }
            else if(rank.get(ulp_u) > rank.get(ulp_v)){
                parent.set(ulp_v,ulp_u);
            }
            else{
                parent.set(ulp_v,ulp_u);
                int rank_U = rank.get(ulp_u);
                parent.set(ulp_u,rank_U);
                
            }
        }

        public void unionBySize(int u ,int v){
            int ulp_u = findUltimateParent(u);
            int ulp_v = findUltimateParent(v);
            if(ulp_u == ulp_v) return;
            if(size.get(ulp_u) < size.get(ulp_v)){
                parent.set(ulp_u,ulp_v);
                size.set(ulp_v,size.get(ulp_u)+size.get(ulp_v));
            }
            else{
                parent.set(ulp_v,ulp_u);
                size.set(ulp_u,size.get(ulp_u) + size.get(ulp_v));
            }
            
        }

    public static void main(String[] args) {
            DisjointSet ds = new DisjointSet(7);
            ds.unionByRank(1,2);
            ds.unionByRank(2,3);
            ds.unionByRank(4,5);
            ds.unionByRank(6,7);
            ds.unionByRank(5,6);

        if (ds.findUltimateParent(3) == ds.findUltimateParent(7)) {
            System.out.println("Same");
        } 
        else  System.out.println("Not Same");

        ds.unionByRank(3, 7);
        if (ds.findUltimateParent(3) == ds.findUltimateParent(7)) {
            System.out.println("Same");
        } else
            System.out.println("Not Same");
    }
}
        
    

