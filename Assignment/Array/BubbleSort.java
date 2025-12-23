package Assignment.Array;

public class BubbleSort {

    public static void printArray(int[] arr){
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void bubblesort(int[] arr){
        int n = arr.length;
        for(int i =0;i<n;i++){
            for(int j = 0;j<n-i-1;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {2,6,1,4,9,4,5};
        printArray(arr);
        bubblesort(arr);
        printArray(arr);

    }
    
}
