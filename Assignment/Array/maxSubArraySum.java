package Assignment.Array;

public class maxSubArraySum {
    public static int maxSubarray(int[] arr,int k){
        int n = arr.length;
        int sum =0;
        for(int i =0;i<k;i++){
            sum+=arr[i];

        }
        int maxSum=sum;
        for(int j=k;j<n;j++){
            sum+=arr[j];
            sum-=arr[j-k];
        }
        maxSum = Math.max(sum,maxSum);
        return maxSum;
        
    }
    public static void main(String[] args) {
        int[] arr = {7,9,4,0,11,13,5,8,12,1};
        System.out.println(maxSubarray(arr, 3));
    }
    
}
