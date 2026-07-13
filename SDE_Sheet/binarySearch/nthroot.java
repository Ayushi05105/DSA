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
    public static void main(String[] args) {
        int n = 3;
        int m = 27;
        System.out.println(root(n, m));
    }
    
}
