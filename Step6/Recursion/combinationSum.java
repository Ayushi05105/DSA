package Step6.Recursion;
import java.util.*;

public class combinationSum {

    public static void helper(int idx , int[] arr,int target,List<List<Integer>> ans,List<Integer> ds){
        if(idx == arr.length){
        if(target==0){
            ans.add(new ArrayList<>(ds));
            
        }
        return;
    }
        if(arr[idx]<=target){
            ds.add(arr[idx]);
            helper(idx, arr, target-arr[idx], ans, ds);
            ds.remove(ds.size()-1);
        }
        helper(idx+1, arr, target, ans, ds);
    }

    public static List<List<Integer>> combinationsum(int[] candidates,int target){
        List<List<Integer>> ans = new ArrayList<>();
        helper(0,candidates,target,ans,new ArrayList<>());
        return ans;
    }
    public static void main(String[] args) {
        int[] candidates ={2,3,6,7};
        System.out.println(combinationsum(candidates, 7));
    }
    
}
