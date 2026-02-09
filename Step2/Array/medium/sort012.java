package Step2.Array.medium;

public class sort012 {
    public static void sortcolor012(int[] arr){
        int n = arr.length;
        int low =0;
        int mid = 0;
        int high = n-1;
        while(mid<=high){
            if(arr[mid]==0){
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                low++;
                mid++;
            }
            else if(arr[mid]==1){
                mid++;
            }
            else{
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr={0,1,0,2,1,0,1,2};
        sortcolor012(arr);
        for(int val:arr){
            System.out.print(val+" ");
        }
        
    }
    
}
