public class lengthLongestSubarray{
          public static int solve(int[] arr,int k){
            
            int len =0;
            for(int i =0;i<arr.length;i++){
                 int sum =0;
                for(int j =i;j<arr.length;j++){
                    sum += arr[j];
                    if(sum ==k) len = Math.max(len,j-i+1);
                    
                }

            }
            return len;
          }


        //optimal one ---> two pointer approach
        public static int solve2(int[] arr,int k){
            int left =0;
            int right =0;
            int n = arr.length;
            int sum =0;
            int maxLen =0;
            while(right <n){
                sum += arr[right];
                while(left <= right && sum > k){
                    sum -= arr[left];
                    left++;
                }
                if(sum ==k) maxLen = Math.max(maxLen,right - left +1);
                right++;
                
            }
            return maxLen;
        }
          public static void main(String[] args) {
            int[] arr ={1,2,3,1,1,1,1};
            int k =3;
            System.out.println(solve2(arr, k));
          }
}