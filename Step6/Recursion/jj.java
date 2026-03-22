package Step6.Recursion;

import java.util.Arrays;

public class jj{
public static boolean uniformArray(int[] nums1) {
        int n =nums1.length;
        int[] arr =nums1;
        Arrays.sort(nums1);
        int min = nums1[0];
        int target = min%2;
        for(int i =0;i<n;i++){
            if(nums1[i]%2!= target){
                boolean parity = false;
                for(int j =0;j<i;j++){
                    if(nums1[i]-nums1[j]>=1 && (nums1[i]-nums1[j])%2 == target){
                        parity = true;
                        break;
                    }
                }
                if(!parity){
                    return false;
                }
            }
            
        }
        return true;
        
}
    public static void main(String[] args) {
        int[] nums1={2,3};
        System.out.println(uniformArray(nums1));
    }
}