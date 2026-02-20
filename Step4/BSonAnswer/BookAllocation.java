package Step4.BSonAnswer;

public class BookAllocation {
    public static int BookAllocationProblem(int[] arr,int k){
        int n = arr.length;
        int high = 0;
        int low = 0;
        for(int i =0;i<n;i++){
            low = Math.max(low,arr[i]);
            high +=arr[i];
        }
        int res =-1;
        while(low<=high){
            int mid =(low+high)/2;
            if(allocationIsPossible(arr,k,mid)){
                res = mid;
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return low;
    }

    private static boolean allocationIsPossible(int[] arr,int k,int barrier) {
        int allocatedStudent = 1;
        int pages = 0;
        int n = arr.length;
        for(int i =0;i<n;i++){
            if(arr[i]>barrier) return false;
            if(pages + arr[i]> barrier){
                allocatedStudent++;
                pages = arr[i];
            }
            else{
                pages += arr[i];
            }
            if(allocatedStudent > k){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] arr ={12,34,67,90};
        int k = 2;
        System.out.println(BookAllocationProblem(arr, k));
    }
    
}
