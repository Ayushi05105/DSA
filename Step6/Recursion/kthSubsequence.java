package Step6.Recursion;

public class kthSubsequence {
    public static int printSubsequence(int idx,int s,int sum,int[] arr,int n){
        if(s>sum) return 0;
        if(idx == n){
            if(s==sum) return 1;
            else return 0;
        }
        s+=arr[idx];
        int l = printSubsequence(idx+1, s, sum, arr, n);
        s-=arr[idx];
        int r = printSubsequence(idx+1, s, sum, arr, n);
        return l+r;
    }

    public static boolean subsequence(int idx,int n ,int[] arr,int k){
        if(k==0) return true;
        if(k<0) return false;
        if(idx==n){
            return k==0;
        }
        return subsequence(idx+1, n, arr, k-arr[idx]) || subsequence(+1, n, arr, k);
    }
    public static boolean kthSubsequenceSum(int[] arr,int target){
        int n = arr.length;
        return subsequence(0, n, arr, target);
    }
    public static void main(String[] args) {
        int[] arr ={1,2,1};
        int n = 3;
        int sum = 2;
        int target = 2;
        System.out.println(printSubsequence(0, 0, sum, arr, n));
        System.out.println(kthSubsequenceSum(arr, target));
    }
}
