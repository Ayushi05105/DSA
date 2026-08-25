package Heap;

public class heapSort {

    public static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

     public static void heapifyDown(int[] arr, int size,int i) {
        
        while(true){
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        int large = i;
        if (left < size && arr[left] > arr[large]) {
            large = left;
        }
        if (right < size && arr[right] > arr[large]) {
            large = right;
        }
        if (large == i) break;
            
        swap(arr, i, large);
        i = large;
    }
    }

    public static void sort(int[] arr){
        int n = arr.length;
        for(int i =n/2-1;i>=0;i--){
            heapifyDown(arr,n,i);
            
        }
        for(int i =n-1;i>0;i--){
            swap(arr,0,i);
            heapifyDown(arr,i,0);
        }
    }

    public static void main(String[] args) {
        int[] arr={5,1,3,4,10};
        sort(arr);
        for(int x:arr){
            System.out.print(x+" ");
        }

    }
    
}
