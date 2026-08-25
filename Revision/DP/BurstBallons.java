package Revision.DP;

public class BurstBallons {
    public static int helper(int[] arr,int i,int j){
        if(i>j) return 0;
        int maxi = Integer.MIN_VALUE;
        for(int idx=i;idx<=j;idx++){
            int coin = arr[i-1] * arr[idx] * arr[j+1];
            int right = helper(arr,idx+1,j);
            int left = helper(arr,i,idx-1);
            int total = coin +left+right;
            maxi = Math.max(maxi,total);
        }
        return maxi;
    }

    public static int maxCoins(int[] arr){
        int n = arr.length;
        int[] nums = new int[n+2];

        nums[0] =1;
        nums[n+1] =1;
        for(int i=0;i<n;i++){
            nums[i+1] = arr[i];
        }
        return helper(nums,1,n);
    }
    public static void main(String[] args) {
        int[] arr={3,1,5,8};
        int ans = maxCoins(arr);
        System.out.println(ans);
    }
    
}
