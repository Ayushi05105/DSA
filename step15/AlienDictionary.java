package step15;
import java.util.*;

public class AlienDictionary {
    public static List<Integer> topoSort(int V,int[][] adj){
        
        int[] indegree = new int[V];
        for(int i =0;i<V;i++){
            for(int j =0;j<V;j++){
                if(adj[i][j]==1){
                indegree[j]++;
            }
        }
        }
        Queue<Integer> q = new LinkedList<>();
        for(int i =0;i<V;i++){
            if(indegree[i]==0){
                q.add(i);
            }
        }
        List<Integer> topo = new ArrayList<>();
        while(!q.isEmpty()){
            int node = q.poll();
            topo.add(node);
            for(int j =0;j<V;j++){
                if(adj[node][j]==1){
                indegree[j]--;
                if(indegree[j]==0){
                    q.add(j);
                }
            }
        }

        }
        return topo;
    }
    public static String order(int N, int K,String[] dictionary){
        
        int[][] adj = new int[K][K];
        
        for(int i =0;i<N-1;i++){
            String s1 = dictionary[i];
            String s2 = dictionary[i+1];
            int len = Math.min(s1.length(),s2.length());
            for(int j =0;j<len;j++){
                if(s1.charAt(j) != s2.charAt(j)){
                    adj[s1.charAt(j)-'a'][s2.charAt(j)-'a']=1;
                    break;
                }
            }

        }
        List<Integer> topo = topoSort(K, adj);
        StringBuilder ans = new StringBuilder();
        for (int node : topo) {
            ans.append((char)(node + 'a'));
        }

        return ans.toString();
    }
    public static void main(String[] args) {
        int N = 5, K = 4;
        String[] dictionary = {"baa", "abcd", "abca", "cab", "cad"};
        String ans = order(N, K, dictionary);
        for(char ch:ans.toCharArray()){
            System.out.print(ch+" ");
        }
        System.out.println();
    }
}
