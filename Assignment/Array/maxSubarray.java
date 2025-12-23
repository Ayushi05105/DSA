package Assignment.Array;

public class maxSubarray {

    public static void print(int[] arr){
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static int MaxSubarrayValue(int[] arr){
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int i =0;i<arr.length;i++){
           sum += arr[i];
            if(sum > max){
                max = sum;
            }
            if(sum < 0){
                sum = 0;
            }
        }
        return max;
    }

    // public static int MaxSubarray(int[] arr){
    //     int max = Integer.MIN_VALUE;
    //     int sum = 0;
    //     int ansStart =-1;
    //     int ansEnd = -1;
    //     int start=0;
    //     for(int i =0;i<arr.length;i++){
    //         if(sum ==0) start = i;
    //        sum += arr[i];
    //         if(sum > max){
    //             max = sum;
    //             ansStart = start;
    //             ansEnd=i;
    //         }
    //         if(sum < 0){
    //             sum = 0;
    //         }
    //     }
    //     return 
    // }

    public static void main(String[] args) {
        int[] arr = {-2,-3,4,-1,-2,1,5,-3};
        print(arr);
        System.out.println(MaxSubarrayValue(arr));
        //System.out.println(MaxSubarray(arr));
    }
    
}
