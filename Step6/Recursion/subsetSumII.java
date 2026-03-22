package Step6.Recursion;

import java.util.*;

public class subsetSumII {
    public static void helper(int idx,int[] nums,List<Integer> ds,List<List<Integer>> ans){
        ans.add(new ArrayList<>(ds));
        for(int i =idx;i<nums.length;i++){
            if(i!=idx && nums[i]==nums[i-1]) continue;
            ds.add(nums[i]);
            helper(i+1, nums, ds, ans);
            ds.remove(ds.size()-1);
        }
    }
    public static List<List<Integer>> subsetSum(int[] nums){
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        helper(0,nums,new ArrayList<>(),ans);
        return ans;
    }
    public static void main(String[] args) {
        int[] nums={1,2,2};
        System.out.println(subsetSum(nums));
    }
    
}
