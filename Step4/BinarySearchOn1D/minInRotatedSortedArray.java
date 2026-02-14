package Step4.BinarySearchOn1D;

public class minInRotatedSortedArray {
     public static int findMin(int[] nums) {
        int n = nums.length;
        int low =0;
        int high = n-1;
       while(low<high){
        int mid = (low+high)/2;
        if(nums[mid]>nums[high]){
            low = mid+1;
        }else{
            high = mid;
        }
       } 
       return nums[low];
    }
    public static void main(String[] args) {
        int[] nums ={1,4,7,2,9,0};
        System.out.println(findMin(nums));
    }
}
