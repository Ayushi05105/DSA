package Step2.Array.easy;

public class largest {
    public static int largestElement(int[] arr){
        int largest = arr[0];
        int n = arr.length;
        for(int i =0;i<n;i++){
            if(arr[i]>largest){
                largest = arr[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        int[] arr = {2,9,4,5,8};
        System.out.println(largestElement(arr));
    }
    
}
