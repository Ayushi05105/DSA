package Step2.Array.easy;

public class linearSearch {

    public static int linearsearch(int[] arr,int target){
        int n = arr.length;
        for(int i =0;i<n;i++){
            if(arr[i]== target) return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,6,7,9,6};
        int target = 6;
        System.out.println(linearsearch(arr, target));
    }
    
}
