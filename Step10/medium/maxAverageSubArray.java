package Step10.medium;

public class maxAverageSubArray {
    public static double Maxsubarray(int[] arr,int k){
        int windowSum =0;
        int n = arr.length;
        for(int i =0;i<k;i++){
            windowSum += arr[i];
        }
        int maxSum = windowSum;

        for(int i =k;i<n;i++){
            windowSum += arr[i];
            windowSum -= arr[i-k];
            maxSum = Math.max(maxSum,windowSum);
        }
       
        return (double)maxSum/k;
    }
    public static void main(String[] args) {
        int[] arr ={1,12,-5,-6,50,3};
        System.out.println(Maxsubarray(arr, 4));
    }
    
}
