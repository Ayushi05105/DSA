package Step10.medium;
import java.util.*;
public class subarrayWithKDifferent {

    public static int helper(int[] arr,int k){
        int left =0;
        int cnt =0;
        HashMap<Integer,Integer> freq = new HashMap<>();
        for(int right =0;right <arr.length;right++){
            freq.put(arr[right],freq.getOrDefault(arr[right],0)+1);
            if(freq.get(arr[right])==1){
                k--;
            }
            while(k<0){
                freq.put(arr[left],freq.get(arr[left])-1);
                if(freq.get(arr[left])==0){
                    k++;
                }
                left ++;
            }
            cnt += (right-left+1);
        }
        return cnt;
    }
    public static int SubarrayKdifferent(int[] arr,int k){
        return helper(arr, k) - helper(arr, k-1);
    }
    public static void main(String[] args) {
        int[] arr ={1,2,1,2,3};
        System.out.println(SubarrayKdifferent(arr, 2));
    }
    
}
