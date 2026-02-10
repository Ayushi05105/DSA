package Step2.Array.medium;

import java.util.ArrayList;
import java.util.List;

public class rearrangeArrayElement {
    public static int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        List<Integer> pos = new ArrayList<>();
        List<Integer> neg = new ArrayList<>();
        for(int i=0;i<n;i++){
            if(nums[i]>0){
                pos.add(nums[i]);
            }else{
                neg.add(nums[i]);
            }
        }
        for(int i =0;i<n/2;i++){
            nums[2*i] = pos.get(i);
            nums[2*i+1]=neg.get(i);
        }
        return nums;
    }

    public static int[] rearrangeArray2(int[] nums) {
        int n = nums.length;
        int pos=0;
        int neg =1;
        int[] ans = new int[n];
        for(int i =0;i<n;i++){
            if(nums[i]<0){
                ans[neg] = nums[i];
                neg+=2;
            }else{
                ans[pos] = nums[i];
                pos+=2;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums ={1,2,-4,-5};
        System.out.print(rearrangeArray(nums));
    }
}
