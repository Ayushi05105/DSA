package step15.ShortestPathAlgorithm;
import java.util.*;

public class networkDelay {

    public static int networkDelayTime(int[][] times ,int n , int k){
        List<List<int[]>> adj = new ArrayList<>();
        for(int i =0;i<=n;i++){
            adj.add(new ArrayList<>());
        }

        for(int[] time : times){
            int u = time[0];
            int v = time[1];
            int w = time[2];
            adj.get(u).add(new int[]{v,w});
        }

        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));
        pq.offer(new int[]{0,k});

        int[] dist = new int[n+1];
        Arrays.fill(dist,(int)1e9);
        dist[k] = 0;

        while(!pq.isEmpty()){
            int[] curr = pq.poll();
            int time = curr[0];
            int node = curr[1];
            for(int[] arr : adj.get(node)){
                int v = arr[0];
                int wt = arr[1];
                if(dist[v] > time + wt){
                    dist[v] = time + wt;
                    pq.offer(new int[]{dist[v],v});
                }
            }
            
        }
        int ans = 0;
        for(int i=1;i<=n;i++){
            if(dist[i]== (int)1e9){
            return -1;
        }
        ans =  Math.max(dist[i],ans);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[][] times ={{2,1,1},{2,3,1},{3,4,1}};
        int n = 4;
        int k = 2;

        System.out.println(networkDelayTime(times, n, k));
    }
    
}
