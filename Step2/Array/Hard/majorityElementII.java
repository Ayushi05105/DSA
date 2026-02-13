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

    public static List<Integer> majorityElement2(int[] nums) {
        int n = nums.length;
        int cnt1 =0;
        int cnt2=0;
        int el1 = Integer.MIN_VALUE;
        int el2 = Integer.MIN_VALUE;
        for(int i =0;i<n;i++){
            if(cnt1 ==0 && nums[i] !=el2){
                cnt1 = 1;
                el1 = nums[i];
            }
            else if(cnt2 ==0 && nums[i] !=el1 ){
                cnt2 = 1;
                el2 = nums[i];
            }
            else if(nums[i]==el1){
                cnt1++;
            }
            else if(nums[i]==el2){
                cnt2++;
            }
            else{
                cnt1--;
                cnt2--;
            }
        }
        cnt1=0;
        cnt2=0;
        for(int i =0;i<n;i++){
            if(nums[i]==el1) cnt1++;
            if(nums[i]==el2) cnt2++;
        }
        int min = n/3+1;
        List<Integer> res = new ArrayList<>();
        if(cnt1 >=min) res.add(el1);
        if(cnt2>=min && el1 != el2) res.add(el2);
        return res;

    }
    public static void main(String[] args) {
        int[] nums={1,1,2,2,3,1,4,4,9,9};
        System.out.println(majorityElement(nums));
    }
    
}
