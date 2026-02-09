package Step2.Array.easy;

import java.util.HashMap;
import java.util.Map;

public class longestSubarrayWith0Sum {
    public static int longestSubarray(int[] arr,int n){
        Map<Integer,Integer> map = new HashMap<>();
        int max =0;
        int sum =0;
        for(int i =0;i<n;i++){
            sum+=arr[i];
            if(sum==0){
                max = i+1;
            }else{
                if(map.containsKey(sum)){
                    max = Math.max(max,i-map.get(sum));
                }else{
                    map.put(sum,i);
                }
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr = {9,-3,3,-1,6,-5};
        int n = arr.length;
        System.out.println(longestSubarray(arr, n));
    }
    
}
