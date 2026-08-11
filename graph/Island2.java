package graph;

import java.util.*;


public class Island2 {
    int[] parent;
    int[] rank;
    int[] size;

    public  Island2(int n,int m){
        int total = n*m;
        parent = new int[total];
        size = new int[total];
        for(int i=0;i<total;i++){
            parent[i] = i;
            size[i] =1;
        }
    }

    public  int findUlp(int node){
        if(node == parent[node]) return node;
        return parent[node] = findUlp(parent[node]);

    }

    public  void UnionByRank(int u, int v) {
        int ulp_u = findUlp(u);
        int ulp_v = findUlp(v);
        if (ulp_u == ulp_v)
            return;
        if (rank[ulp_u] < rank[ulp_v]) {
            parent[ulp_u] = ulp_v;
        } else if (rank[ulp_u] > rank[ulp_v]) {
            parent[ulp_v] = ulp_u;
        } else {
            parent[ulp_v] = ulp_u;
            rank[ulp_u]++;
        }
    }

    public  void UnionBySize(int u, int v) {
        int ulp_u = findUlp(u);
        int ulp_v = findUlp(v);
        if (ulp_u == ulp_v)
            return;
        if (size[ulp_u] < size[ulp_v]) {
            parent[ulp_u] = ulp_v;
            size[ulp_v] += size[ulp_u];
        } else {
            parent[ulp_v] = ulp_u;
            size[ulp_u] += size[ulp_v];
        }
    }

    public  ArrayList<Integer> noofOperation(int n, int m, int[][] operation) {
        int[][] vis = new int[n][m];
        ArrayList<Integer> ans = new ArrayList<>();
        int cnt = 0;
        for (int[] it : operation) {
            int r = it[0];
            int c = it[1];
            if (vis[r][c] == 1) {
                ans.add(cnt);
                continue;
            }
            vis[r][c] = 1;
            cnt++;

            int[] dr = { -1, 0, 1, 0 };
            int[] dc = { 0, 1, 0, -1 };
            for (int i = 0; i < 4; i++) {
                int nr = r + dr[i];
                int nc = c + dc[i];
                if (nr >= 0 && nr < n && nc >= 0 && nc < m && vis[nr][nc] == 1) {
                    
                        int node = r * m + c;
                        int adjNode = nr * m + nc;
                        if (findUlp(node) != findUlp(adjNode)) {
                            cnt--;
                            UnionBySize(node, adjNode);
                        }
                }
            }
            ans.add(cnt);
        }
        return ans;
    }

    public static void main(String[] args) {
        int n = 4;
        int m = 5;
        
        int[][] operation = { { 1, 1 }, { 0, 1 }, { 3, 3 }, { 3, 4 } };
        Island2 obj = new Island2(n, m);
        ArrayList<Integer> ans = obj.noofOperation(n, m, operation);
        System.out.println(ans);
    }
}
