package Assignment.Array;

public class max_Product_subarray {

    public static int maxProductSubarray(int[] arr){
        int max = Integer.MIN_VALUE;
        int prod =1;
        for(int i =0;i<arr.length;i++){
            prod *=arr[i];
            if(prod > max){
                max = prod;
            }
            // if(prod < 0){
            //     prod = 1;
            // }
            if(prod == 0){
                prod = 1;
                max = 0;
            }
            if(prod < 0){
                prod = 1;
            }
        }
        return max;
    }

    public static int maxProduct(int[] arr){
        int pre = 1,suff = 1;
        int ans = Integer.MIN_VALUE;
        int n = arr.length;
        for(int i =0;i<n;i++){
            if(pre ==0) pre = 1;
            if(suff ==0) suff = 1;

            pre = pre * arr[i];
            suff = suff * arr[n-i-1];
            ans = Math.max(ans, Math.max(pre, suff));
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr={-3,-1,-1};
        System.out.println(maxProductSubarray(arr));
    }
    
}
