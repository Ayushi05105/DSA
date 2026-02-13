package Step4.BinarySearchOn1D;

public class search {
    public static int search1(int[] nums, int target) {
        int n = nums.length;
        for(int i =0;i<n;i++){
            if(nums[i]==target) return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] nums ={-1,0,1,3,5,7,9};
        int target = 5;
        System.out.println(search1(nums, target));
    }
    
}
