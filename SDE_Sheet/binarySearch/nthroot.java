package SDE_Sheet.binarySearch;
import java.util.*;

public class nthroot {
    public static int root(int n,int m){
        for(int i =1;i<m;i++){
            long pow = (long) Math.pow(i, n);
            if(pow == m) return i;
            if(pow > m) break;

        }
        return -1;
    }

    public static int root2(int n ,int m){
        int low =1;
        int high = m;

        while(low<=high){
            int mid = (low+high)/2;
            long ans =1;
            for(int i =0;i<n;i++){
             ans *= mid;
             if(ans >m) break;
           }
             if(ans == m) return mid;

             if(ans<m) low = mid+1;
             else high = mid-1;
           }
        return -1;
        
    }
    public static void main(String[] args) {
        int n = 3;
        int m = 27;
        System.out.println(root(n, m));
        System.out.println(root2(n, m));
    }
    
}
