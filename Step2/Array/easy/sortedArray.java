package Step2.Array.easy;

public class sortedArray {
    public static boolean sorted(int[] arr){
        for(int i =0;i<arr.length;i++){
            if(arr[i] > arr[i-1]){
                return true;
            }else{
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] arr = {1,4,8,3,9,3};
        sorted(arr);
    }
}
