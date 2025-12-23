package Assignment.Array;

public class selectionSort {
    
    public static void printArray(int[] arr){
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void SelectionSort(int[] arr){
        int n = arr.length;
        for(int i = 0;i<n;i++){
            int min_idx = i;
            for(int j =i+1;j<n;j++){
                if(arr[j]<arr[min_idx]){
                min_idx = j;
             }
            }
            int temp = arr[i];
            arr[i] = arr[min_idx];
            arr[min_idx] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {2,6,1,9,34,56,43,12};
        printArray(arr);
        SelectionSort(arr);
        printArray(arr);
    }
    
}
