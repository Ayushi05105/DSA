package Step4.BinarySearchOn1D;

// TC->O(N)
public class search {
    public static int search1(int[] nums, int target) {
        int n = nums.length;
        for(int i =0;i<n;i++){
            if(nums[i]==target) return i;
        }
        return -1;
    }
  
    // TC->O(logN)
    public int search2(int[] nums, int target) {
        int n = nums.length;
        int low =0,high = n-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(nums[mid]==target) return mid;
            else if(target > nums[mid]) low = mid+1;
            else high = mid-1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] nums ={-1,0,1,3,5,7,9};
        int target = 5;
        System.out.println(search1(nums, target));
    }
    
}
