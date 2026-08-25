package Heap;

// public class MinHeap{
//     int[] arr;
//     int size;
//     MinHeap(int capacity){
//         arr = new int[capacity];
//         size =0;
//     }
// }
public class implementation {

    public static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void insert(int[] arr, int val) {
        int n = arr.length - 1;
        arr[n] = val;
        while (n > 0) {
            int parent = (n - 1) / 2;
            if (arr[parent] > arr[n]) {
                swap(arr, parent, n);
                n = parent;
            } else {
                break;
            }
        }
    }

    public static void heapifyDown(int[] arr, int i) {
        int n = arr.length;
        while(true){
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        int small = i;
        if (left < n && arr[left] < arr[small]) {
            small = left;
        }
        if (right < n && arr[right] < arr[small]) {
            small = right;
        }
        if (small == i) break;
            
        swap(arr, i, small);
        i = small;
    }
    }


    public static void heapifyUp(int[] arr, int i) {
        
        while (i > 0) {
            int parent = (i - 1) / 2;
            if (arr[parent] < arr[i]) {
                swap(arr, parent, i);
                i = parent;
            } else {
                break;
            }
        }
    }

    

    public static int remove(int[] arr,int size){
        int root = arr[0];
        arr[0] = arr[arr.length-1];
        size--;
        heapifyDown(arr, size);
        return root;
    }

    public static void main(String[] args) {
        int[] arr = { 10, 20, 15, 30, 40 };
        insert(arr, 5);
        for (int x : arr) {
            System.out.print(x + " ");
        }

    }

}
