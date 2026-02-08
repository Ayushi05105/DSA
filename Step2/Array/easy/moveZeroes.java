package Step2.Array.easy;

public class moveZeroes {
    public static void moveZero(int[] arr){
        int n = arr.length;
        int j =-1;
        for(int i =0;i<n;i++){
            if(arr[i]==0){
                j = i;
                break;
            }
        }
        if(j == -1) return;
        for(int i= j+1;j<n;j++){
            if(arr[i]!=0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
    }
    public static void main(String[] args) {
     int[] arr = {1,0,0,3,4,0,5,6,0,2};
     moveZero(arr);
    }
}
