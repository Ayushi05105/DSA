package Assignment.Array;


public class removingMaxMin {


    public static int minimumDeletion(int[] arr){
        int minIdx =0;
        int maxIdx = 0;
        for(int i =0;i<arr.length;i++){
        if(arr[i] < arr[minIdx]) minIdx = i;
        if(arr[i] > arr[maxIdx]) maxIdx = i;
        }
        int n = arr.length;
        int front = Math.max(minIdx , maxIdx) +1;
        int back = n - Math.min(minIdx, maxIdx);

        int mix = Math.min(minIdx , maxIdx) +1 +(n - Math.max(minIdx,maxIdx));

        int ans = Math.min(front,Math.min(back , mix));

        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {2,10,7,5,4,1,8,6};
        int result = minimumDeletion(arr);
        System.out.println(result);

    }
    
}
