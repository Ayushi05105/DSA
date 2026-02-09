package Step2.Array.easy;

public class missingNo {
    public static int missingNumber(int[] nums) {
        int n = nums.length;
        int sum =0;
        int expectedSum =0;
     for(int i =0;i<n;i++){
            expectedSum = n*(n+1)/2;
        }
      for(int i =0;i<n;i++){
         sum+=nums[i];
      } 
      return expectedSum-sum; 
    }
    public static void main(String[] args) {
        int[] nums={0,1,2,4,5,6};
        System.out.println(missingNumber(nums));
    }
    
}
