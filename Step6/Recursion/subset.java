package Step6.Recursion;

import java.util.*;

public class subset {

    public static void helper(int idx,int[] nums,List<Integer> ds,List<List<Integer>> ans){
        if(idx == nums.length){
            ans.add(new ArrayList<>(ds));
            return;
        }
        ds.add(nums[idx]);
        helper(idx+1, nums, ds, ans);
        ds.remove(ds.size()-1);
        helper(idx+1, nums, ds, ans);
    }

    public static List<List<Integer>> allSubset(int[] nums){
        List<List<Integer>> ans = new ArrayList<>();
        helper(0, nums, new ArrayList<>(), ans);
        return ans;        
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        System.out.println(allSubset(nums));
    }
    
}
