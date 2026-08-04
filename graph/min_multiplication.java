package graph;

import java.util.*;

class Pair{
    int first;
    int second;
    Pair(int first,int second){
        this.first = first;
        this.second = second;
    }
}
public class min_multiplication {

    public static int minimumMultiplication(int[] arr,int start,int end){
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
            int node = q.peek().first;
            int step = q.peek().second;
            q.remove();

            for(int i =0;i<n;i++){
                int num = (arr[i]*node)%mod;
                if(step+1<dist[num]){
                    dist[num] = step+1;
                    if(num==end) return step+1;
                    q.add(new Pair(num,step+1));
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr ={2,5,7};
        int start =3;
        int end = 30;
        System.out.println(minimumMultiplication(arr, start, end));
    }


    
}
