package Step10.medium;

public class maxScore {


    //Brute Force take O(N^2)
    public static int MaxScore(int[] arr,int k){
        int n = arr.length;
        int maxSum =0;
        for(int i =0;i<=k;i++){
            int tempSum =0;
            for(int j =0;j<i;j++){
                tempSum += arr[j];
            }
            for(int j =0;j<k-i;j++){
                tempSum += arr[n-1-j];
            }
            maxSum = Math.max(maxSum,tempSum);
        }
        return maxSum;

    }


    // optimal O(2*k) time
    public static int maxPoint(int[] arr,int k){
        int leftSum =0;
        int rightSum =0;
        int n = arr.length;
        for(int i =0;i<k;i++){
            leftSum += arr[i];
        }
        int maxSum = leftSum;
        int rightIndex = n-1;
        for(int i =k-1;i>=0;i--){
            leftSum = leftSum - arr[i];
            rightSum = rightSum + arr[rightIndex];
            rightIndex = rightIndex-1;
        }
        maxSum = Math.max(maxSum,(leftSum + rightSum));
        return maxSum;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,1};
        int k = 3;
        System.out.println(MaxScore(arr, k));
        System.out.println(maxPoint(arr, k));
    }
    
}
