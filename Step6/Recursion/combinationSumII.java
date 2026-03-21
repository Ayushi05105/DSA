package Step6.Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class combinationSumII {

    private static void helper(int idx,int[] arr,int target, List<List<Integer>> ans,List<Integer> ds){
        if(target ==0){
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i =idx;i<arr.length;i++){
            if(i>idx && arr[i]==arr[i-1]) continue;
            if(arr[i]> target) break;
            ds.add(arr[i]);
            helper(i+1, arr, target-arr[i], ans, ds);
            ds.remove(ds.size()-1);
        }

    }
    public static List<List<Integer>> combinationSum(int[] candidates,int target){
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates);
        helper(0, candidates, target, ans, new ArrayList<>());
        return ans;
    }
    
    public static void main(String[] args) {
        int[] candidates ={2,5,2,1,2};
        System.out.println(combinationSum(candidates, 5));
    }
    
}
