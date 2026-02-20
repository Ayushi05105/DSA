package Step4.BSonAnswer;

public class SmallestDivisorThreshold {
    public static int smallestDivisor(int[] nums, int threshold) {
        int n = nums.length;
        int low = 1;
        int high = 0;
        for(int val : nums){
            high = Math.max(high,val);
        }
        while(low<=high){
            int mid = low+(high-low)/2;
            int sum =0;
            for(int val :nums){
                sum+=(val+mid-1)/mid;
            }
            if(sum<=threshold){
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return low;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,5,9};
        int threshold = 6;
        System.out.println(smallestDivisor(nums, threshold));
    }
}
