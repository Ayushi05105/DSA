package Assignment.Array;

public class findElement {
    //linear search
    //time complexity O(n)
    //space complexity O(logn)
    public static int linearFind(int[] arr,int k){
        for(int i =0;i<arr.length;i++){
            if(arr[i]==k){
                return i;
            }
        }
       return -1;
    }

    public static int binaryFind(int[] arr,int low , int high , int k){
         if(high < low ) return -1;
         int mid = low + (high-low)/2;
         if(k == arr[mid]) return arr[mid];
         else if(k >mid){
           return  binaryFind(arr, mid + 1, high, k);
         }
         return binaryFind(arr, low, mid-1, k);
    }

    public static void main(String[] args) {
        int[] arr = {20,30,12,24,70,99};
        int k = 70;
        int n = arr.length-1;
        System.out.println(linearFind(arr, k));
        System.out.println(binaryFind(arr, 0, n, k));
    }
}
