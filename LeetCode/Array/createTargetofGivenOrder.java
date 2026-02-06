package LeetCode.Array;

import java.util.ArrayList;
import java.util.List;

public class createTargetofGivenOrder {

    public int[] createTargetArray(int[] nums, int[] index) {
        int n = nums.length;
        List<Integer> list = new ArrayList<>();
        int[] target = new int[n];
        for(int i=0;i<n;i++){
            list.add(index[i],nums[i]) ;
        }
        for(int i =0;i<nums.length;i++){
            target[i] = list.get(i);
        }
        return target;
    }
    
}
