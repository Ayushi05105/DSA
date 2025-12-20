package Step1.Lec4;

public class SearchInsertPosition {
    static int search(int[] nums,int target){
        int left=0;
        int right=nums.length-1;
        while(left<=right){
            int mid= left +(right-left)/2;
            if(nums[mid] == target) return mid;
            else if(nums[mid] < target) left= mid +1;
            else right = mid-1;
        }
        return left;
    }
    public static void main(String[] args) {
        int[] nums = {3,5,6,15,18};
        int target = 9;
        System.out.println(search(nums, target));
    }
    
}
