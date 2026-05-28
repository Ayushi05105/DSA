package GreedyAlgorithm.medium;

import java.util.*;

public class minNoofPlatform {
public static int MinNoPlatform(int n,int[] arr,int[] dept){
    Arrays.sort(arr);
    Arrays.sort(dept);
    int i =1;
    int j =0;
    int cnt =1;
    int maxcnt =1;
    while(i<n && j<n){
        if(arr[i]<=dept[j]){
            cnt = cnt+1;
            i = i+1;
        }
        else{
            cnt = cnt-1;
            j = j+1;
        }
        maxcnt= Math.max(maxcnt,cnt);
    }
    return maxcnt;
}
public static void main(String[] args) {
    int[] arr = {900, 945, 955, 1100, 1500, 1800};
    int[] dep = {920, 1200, 1130, 1150, 1900, 2000};
    int n= arr.length;
    System.out.println(MinNoPlatform(n, arr, dep));
}
    
}
