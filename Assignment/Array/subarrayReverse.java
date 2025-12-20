package Assignment.Array;
import java.util.ArrayList;
import java.util.Arrays;


public class subarrayReverse {

    public static void display(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void reverse(int[] arr,int M){
        int i = M+1,j=arr.length-1;
        while(i<j){
            swap(arr, i, j);
            i++;
            j--;
        }
    }


   

// using arraylist coding ninga question
    public static void reverseArray(ArrayList<Integer> arr, int m)
    {
        // Write your code here.
        int i = m+1;
        int j = arr.size() -1;
        while(i < j){
          int temp = arr.get(i);
          arr.set(i,arr.get(j));
          arr.set(j , temp);
          i++;
          j--;
      }
    }



    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int M = 3;
        reverse(arr,M);
        display(arr);

        ArrayList<Integer> arr1 = new ArrayList<>(
        Arrays.asList(1, 2, 3, 4, 5, 6));
        int m1 = 3;

        reverseArray(arr1, m1);
        System.out.println(arr1);
    }
    
}
