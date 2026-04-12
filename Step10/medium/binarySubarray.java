package Step10.medium;

public class binarySubarray {
    
    public static int helper(int[] arr ,int goal){
        if(goal < 0) return 0;
        int left =0;
        int right =0;
        int n = arr.length;
        int sum =0;
        int cnt =0;
        while(right < n){
            sum += arr[right];
            while(sum > goal){
                sum = sum - arr[left];
                left = left+1;
            }
            cnt = cnt + (right-left+1);
            right = right +1;
        }
        return cnt;
    }

    public static int binarySubArray(int[] arr,int goal){
        return helper(arr, goal) - helper(arr, goal-1);

    }
    public static void main(String[] args) {
        int[] arr ={0,0,0,0,0};
        int goal =0;
        System.out.println(binarySubArray(arr,goal));
    }
}
