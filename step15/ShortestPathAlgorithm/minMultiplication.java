package step15.ShortestPathAlgorithm;
import java.util.*;
public class minMultiplication {
    public static class Pair{
        int first;
        int second;
        Pair(int first,int second){
            this.first = first;
            this.second = second;
        }
    }

    public static int minimum_Multiplication(int[] arr ,int start ,int end){
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(start,0));
        int[] dist = new int[100000];

        for(int i =0;i<100000;i++){
            dist[i] =(int)1e9;
        }
        dist[start] =0;
        int mod = 100000;
        int n = arr.length;

        while(!q.isEmpty()){
            Pair p = q.poll();
            int node = p.first;
            int step = p.second;
            
            for(int i =0;i<n;i++){
                int num = (arr[i] * node) % mod;
                if(step + 1 <dist[num]){
                    dist[num] = step + num;
                }
                if(num == end) return step +1;
                q.add(new Pair(num,step +1));
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int start = 3, end = 30;
        int[] arr = {2, 5, 7};
        System.out.println(minimum_Multiplication(arr, start, end));
    }
    
}
