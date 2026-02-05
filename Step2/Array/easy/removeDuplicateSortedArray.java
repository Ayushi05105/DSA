package Step2.Array.easy;

public class removeDuplicateSortedArray {
    public static int removeDuplicate(int[] arr){
        int n = arr.length;
        int i =0;
            for(int j = i+1;j<n;j++){
                if(arr[j] != arr[i]){
                    arr[i+1] = arr[j];
                    i++;
                }
                
            }
            return i+1;
        }
    
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,3,4,5,5,7,7,7,7};
        System.out.println(removeDuplicate(arr));

    }
}
