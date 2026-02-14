package Step4.BinarySearchOn1D;

public class floorCeil {
    public static int floor(int[] arr,int x){
        int low =0;
        int high = arr.length-1;
        int ans = -1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]<=x){
                ans = arr[mid];
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return ans;
    }

    public static int Ceil(int[] arr,int x){
        int low =0;
        int high = arr.length-1;
        int ans = -1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]>=x){
                ans = arr[mid];
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return ans;
    }

    public static int[] getfloorCeil(int[] arr,int x){
        int f = floor(arr, x);
        int c = Ceil(arr, x);
        return new int[]{f,c};
    }

    public static void main(String[] args) {
        int[] arr={3,4,4,7,8,10};
        int x=5;
        int[] res = getfloorCeil(arr, x);
        System.out.println(res);
    }


}
