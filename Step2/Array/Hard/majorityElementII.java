package Step2.Array.Hard;
import java.util.*;

public class majorityElementII {
    public static List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        List<Integer> res = new ArrayList<>();
        Map<Integer,Integer> map = new HashMap<>();
        int minimum = n/3+1;
        for(int i=0;i<n;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);

        if(map.get(nums[i])==minimum){
            res.add(nums[i]);
        }
        if(res.size()==2){
            break;
        }
        }
        
        return res;
    }
    public static void main(String[] args) {
        int[] nums={1,1,2,2,3,1,4,4,9,9};
        System.out.println(majorityElement(nums));
    }
    
}
