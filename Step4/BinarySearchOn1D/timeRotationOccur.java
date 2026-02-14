package Step4.BinarySearchOn1D;


public class timeRotationOccur {
    
    public static int findKRotation(int[] nums) {
        int low =0;
        int high = nums.length-1;
        while(low<high){
            int mid = (low+high)/2;
            if(nums[mid]>nums[high]){
                low = mid+1;
            }else{
                high = mid;
            }
        }
      return low;

    }
    public static void main(String[] args) {
        int[] nums={4,5,6,7,0,1,2,3};
        System.out.println(findKRotation(nums));
    }
}
