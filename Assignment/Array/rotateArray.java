package Assignment.Array;

public class rotateArray {

    public static void print(int[] arr){
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void reverse(int[] arr,int i , int j){
        while(i< j){
            swap(arr, i, j);
            i++;
            j--;
        }
    }

    public static void rotatereverse(int[] arr , int k){
        int n = arr.length ;
        k=k%n;
        reverse(arr, 0, n-k-1);
        reverse(arr, n-k, n-1);
        reverse(arr, 0, n-1);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int k =3;
        rotatereverse(arr, k);
        print(arr);

    }
    
}
