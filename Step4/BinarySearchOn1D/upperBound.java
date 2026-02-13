package Step4.BinarySearchOn1D;

public class upperBound {

    public static int upperBound1(int[] nums, int x) {
        int n= nums.length;
       for(int i =0;i<n;i++){
        if(nums[i]>x){
            return i;
        } 
       }
       return nums.length;
     }

     // optimal approach TC->O(log n)
    public static int upperBound2(int[] nums, int x) {
        int n = nums.length;
        int high = n-1;
        int ans = n;
        int low =0;
        while(low<=high){
            int mid = (low+high)/2;
            if(nums[mid]>=x){
                ans = mid;
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums={3,5,8,15,19};
        int x =9;
        System.out.println(upperBound1(nums, x));
        System.out.println(upperBound2(nums, x));
     }
    
}
