package Step2.Array.medium;

import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;


public class longestConsecutive {

    //Better approach Tc->O(n log n)   Sc-> O(1)
    public static int longestConsecutiveSum(int[] arr){
        int n = arr.length;
        if(n==0) return 0;
        Arrays.sort(arr);
        int smaller = Integer.MIN_VALUE;
        int count = 0;
        int longest = 1;
        for(int i=0;i<n;i++){
            if(arr[i]-1 == smaller){
                count+=1;
                smaller = arr[i];
            }
            else if(arr[i] != smaller){
                count =1;
                smaller = arr[i];
            }
            longest = Math.max(longest,count);
        }
        return longest;
    }


    // optimal approach it take Tc->O(n)  Sc->O(n)
    public static int longestConsecutiveSum1(int[] arr){
        int n = arr.length;
        if(n==0) return 0;
        int longest = 1;
        Set<Integer> st = new HashSet<>();
        for(int i =0;i<n;i++){
            st.add(arr[i]);
        }
        for(int val : st){
            if(!st.contains(val-1)){
                int count =1;
                int x = val;
                while(st.contains(x+1)){
                    x = x+1;
                    count = count +1;
                }
                longest = Math.max(longest,count);
            }
        }
        return longest;
    }
    public static void main(String[] args) {
        int[] arr={100,4,200,1,3,2};
        System.out.println(longestConsecutiveSum(arr));
    }
}
