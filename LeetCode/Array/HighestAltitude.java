package LeetCode.Array;

public class HighestAltitude {
     public static int largestAltitude(int[] gain) {
        int curr =0;
        int maxAltitude =0;
        int n = gain.length;
        for(int i =0;i<n;i++){
            curr+= gain[i];
            maxAltitude = Math.max(maxAltitude,curr);
        }
        return maxAltitude;
    }
}
