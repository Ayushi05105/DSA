package Step10.medium;

public class countNiceNo {
    public static int helper(int[] arr,int k){
        if(k<0) return 0;
        int left =0;
        int right =0;
        int sum =0;
        int cnt =0;
        int n = arr.length;
        while(right<n){
            sum += arr[right] %2;
            while(sum > k){
                sum -= arr[left] %2;
                left++;
            }
            cnt = cnt +(right-left +1);
            right++;
        }
        return cnt;
    }
    public static int NiceNo(int[] arr,int k){
        return helper(arr, k) - helper(arr, k-1);
    }
    public static void main(String[] args) {
        int[] arr ={1,1,2,1,1};
        int k =3;
        System.out.println(NiceNo(arr, k));
    }
    
}
