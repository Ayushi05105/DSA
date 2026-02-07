package LeetCode.Array;

public class sumOddSubarray {
      public int sumOddLengthSubarrays(int[] arr) {
        int n = arr.length;
        int totalSum =0;
        for(int i =1;i<=n;i+=2){
            for(int j =0;j+i<=n;j++){
                for(int k =j;k<j+i;k++){
                    totalSum += arr[k];
                }
            }
        }
        return totalSum;
    }
    
}
