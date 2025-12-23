package Assignment.Array;

public class InsertionSort {

    public static void printArray(int[] arr){
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void insertionort(int[] arr){
        for(int i =1;i<arr.length;i++){
            int j =i;
            while(j>0 && arr[j] < arr[j-1]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }

        }
    }

    public static void main(String[] args) {
        int[] arr = { 34,67,21,90,78,23,65};
        printArray(arr);
        insertionort(arr);
        printArray(arr);
    }
    
}
