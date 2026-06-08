package SDE_Sheet.Array2;
import java.util.*;

public class missing_repetiting {

    public static int[] findMissingRepeating(int[] nums){
        int n = nums.length;
        int[] freq = new int[n+1];
        Arrays.fill(freq,0);

        for(int i =0;i<n;i++){
            freq[nums[i]]++;
        }
        int repeating = -1;
        int missing = 1;
        for(int i =0;i<n;i++){
            if(nums[i]==2) repeating = i;
            else if(nums[i]==0) missing = i;
            if(repeating !=-1 && missing !=-1){
                break;
            }
        }
        return new int[]{repeating,missing};
    }
    public static void main(String[] args) {
        int[] nums={1,2,3,6,7,5,7};
        System.out.println(findMissingRepeating(nums));
    }
    
}
