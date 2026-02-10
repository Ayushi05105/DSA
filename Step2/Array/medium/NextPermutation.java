package Step2.Array.medium;

import java.util.Arrays;

public class NextPermutation {
    public static void swap(int[] nums,int i,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public static void reverse(int[] nums,int i ,int j){
        while(i<j){
            swap(nums,i,j);
            i++;
            j--;
        }
    }
    public static void next_Permutation(int[] nums) {
        int n = nums.length;
        int idx =-1;
        for(int i =n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                idx =i;
                break;
            }
        }
        if(idx ==-1){
            reverse(nums,0,n-1);
            return;
        }
        for(int i=n-1;i>=idx;i--){
            if(nums[i]>nums[idx]){
                swap(nums,i,idx);
                break;
            }
        }
        reverse(nums,idx+1,n-1);
    }
    public static void main(String[] args) {
        int[] nums ={2,1,5,4,3,0,0};
        next_Permutation(nums);
        System.out.println(Arrays.toString(nums));        
    }
}
