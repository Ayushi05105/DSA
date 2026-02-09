package Step2.Array.medium;
import java.util.Arrays;
import java.util.HashMap;


public class twoSum {

//brute force just two loop    
//better solution    
    public static int[] twoSumLeet(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i =0;i<nums.length;i++){
            int res = target - nums[i];
            if(map.containsKey(res)){
                return new int[]{map.get(res),i};
            }
            map.put(nums[i],i);
        }
        return new int[]{-1,-1};
    }

// optimal solution
//greddy approach
    public static int[] TwoSum(int[] arr,int target){
        int n = arr.length;
        Arrays.sort(arr);
        int left = 0;
        int right = n-1;
        while(left<right){
            int sum = arr[left] + arr[right];
            if(sum==target) return new int[]{left,right};
            if(sum <target){
                left++;
            }
            else{
                right--;
            }
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        int[] arr ={2,6,5,8,11};
        int target = 14;
        System.out.println(Arrays.toString(TwoSum(arr, target)));
        System.out.println(Arrays.toString(twoSumLeet(arr, target)));
    }
    
}
