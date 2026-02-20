package Step4.BSonAnswer;

import java.util.Arrays;

public class AggresiveCows {


    private static boolean canWePlace(int[] nums, int dist, int cows) {
       int count =1;
       int last = nums[0];
       for(int i =0;i<nums.length;i++){
        if(nums[i]-last >= dist){
            count++;
            last = nums[i];
        }
        if(count >= cows) return true;
       }
       return false;
    }

    public static int AggresiveCow(int[] nums,int k){
        Arrays.sort(nums);
        int n = nums.length;
        int low =1;
        int high = nums[n-1]-nums[0];
        while(low<=high){
            int mid = (low+high)/2;
            if(canWePlace(nums,mid,k)==true){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return high;
    }

    public static void main(String[] args) {
        int[] nums ={4,2,1,3,6};
        int k = 2;
        System.out.println(AggresiveCow(nums, k));
    }

    
    
}
