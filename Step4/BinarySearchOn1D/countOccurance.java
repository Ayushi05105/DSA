package Step4.BinarySearchOn1D;

public class countOccurance {
    public static int firstOccurance(int[] nums,int target){
        int n = nums.length;
        int low =0;
        int high = n-1;
        int ans =-1;
        while(low<=high){
            int mid =low + (high-low)/2;
            if(nums[mid]==target){
                ans = mid;
                high = mid-1;
            }
            else if(nums[mid]<target){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return ans;
    }
    public static int lastOccurance(int[] nums,int target){
        int n = nums.length;
        int low =0;
        int high = n-1;
        int last =-1;
        while(low<=high){
            int mid =low + (high-low)/2;
            if(nums[mid]==target){
                last = mid;
                low = mid+1;
                
            }
            else if(nums[mid]<target){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return last;
    }
    public static int[] searchRange(int[] nums, int target) {
        int first = firstOccurance(nums,target);
        if(first ==-1) return new int[]{-1,-1};
        int last = lastOccurance(nums,target);
        return new int[]{first,last};
    }

    public static int count(int[] nums,int target){
        int[] ans = searchRange(nums, target);
        if(ans[0]==-1) return 0;
        return (ans[1]-ans[0]+1);
    }

    public static void main(String[] args) {
        int[] nums={3,4,13,13,13,20,40};
        int target = 13;
        int ans = count(nums, target);
        System.out.println(ans);
    }
    
}
