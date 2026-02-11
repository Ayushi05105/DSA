package Step2.Array.medium;

import java.util.ArrayList;
import java.util.List;

public class permutation {
     private static void recPermute(int[] nums,List<Integer> ds , List<List<Integer>> ans , boolean []freq){
        if(ds.size() == nums.length){
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i =0;i<nums.length;i++){
            if(!freq[i]){
                freq[i] = true;
                ds.add(nums[i]);
                recPermute(nums,ds,ans,freq);
                ds.remove(ds.size()-1);
                freq[i] = false;
            }
        }
    }
    public static List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        boolean freq[] = new boolean[nums.length];
        recPermute(nums,ds,ans,freq);
        return ans;
    }
    public static void main(String[] args) {
        int[] nums = {1,1,2};
        
        System.out.println(permuteUnique(nums));
    }
    
}
