package Step4.BSonAnswer;

public class SplitArrayLargestSum {
    public static int countPartition(int[] arr,int maxSum){
        int partition =1;
        int sum =0;
        for(int num: arr){
            if(sum + num <= maxSum){
                sum += num;
            }else{
                partition++;
                sum = num;
            }
        }
        return partition;
    }
    public static int splitArray(int[] nums, int k) {
        int low =0;
        int high = 0;
        int n = nums.length;
        for(int i =0;i<n;i++){
            low = Math.max(low,nums[i]);
            high += nums[i];
        }
        while(low<=high){
            int mid =low +(high-low)/2;
            int partition = countPartition(nums,mid);
            if(partition >k){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return low;
    }
    public static void main(String[] args) {
        int[] nums ={7,2,5,10,8};
        int k = 2;
        System.out.println(splitArray(nums, k));
    }
}
