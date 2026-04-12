package Step10.medium;

public class minsizeSubarray {
    public static int minSubarray(int[] arr,int target){
        int left =0;
        int sum =0;
        int minlen = Integer.MAX_VALUE;
        int n = arr.length;
        for(int right =0;right<n;right++){
            sum += arr[right];
            while(sum >= target){
                minlen = Math.min(minlen,right-left+1);
                sum -= arr[left];
                left++;
            }
        }
        return (minlen == Integer.MAX_VALUE) ? 0:minlen;
    }

    public static void main(String[] args) {
        int[] arr ={2,3,1,2,4,3};
        System.out.println(minSubarray(arr, 7));
    }
    
}
