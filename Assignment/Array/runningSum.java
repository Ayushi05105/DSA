package Assignment.Array;

public class runningSum {

    public static int[] runningsumArray(int[] arr){
        for(int i =1;i<arr.length;i++){
            arr[i]= arr[i] + arr[i-1];
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int[] m = runningsumArray(arr);
        for(int i =0;i<m.length;i++){
            System.out.print(m[i] + " ");
        }
    
}
    
}
