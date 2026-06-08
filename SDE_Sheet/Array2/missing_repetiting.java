package SDE_Sheet.Array2;
import java.util.*;

public class missing_repetiting {

    public static int[] findMissingRepeating(int[] nums){
        int n = nums.length;
        int[] freq = new int[n+1];
       

        for(int i =0;i<n;i++){
            freq[nums[i]]++;
        }
        int repeating = -1;
        int missing = 1;
        for(int i =1;i<=n;i++){
            if(freq[i]==2) repeating = i;
            else if(freq[i]==0) missing = i;
            if(repeating !=-1 && missing !=-1){
                break;
            }
        }
        return new int[]{repeating,missing};
    }

    public static int[] findMissingRepeating2(int[] nums){
        int n = nums.length;
        long sum = (n*(n+1))/2;
        long sumSqr = (n*(n+1)*(2*n+1))/6;
        long s =0;
        long s2 =0;
        for(int i =0;i<n;i++){
            s +=nums[i];
            s2 +=(long) nums[i]*nums[i]; 
        }
        long val1 = s-sum;
        long val2  = (s2-sumSqr)/val1;
       // val2 = val2/val1;
        long x = (val1+val2)/2;
        long y = x-val1;

        return new int[]{(int)x,(int)y};

    }
    public static void main(String[] args) {
        int[] nums={1,2,3,6,7,5,7};
        int[] ans = findMissingRepeating(nums);
        int[] ans2 = findMissingRepeating2(nums);
        System.out.println(Arrays.toString(ans));
        System.out.println(Arrays.toString(ans2));
    }
    
}
