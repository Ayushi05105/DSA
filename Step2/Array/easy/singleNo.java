package Step2.Array.easy;

public class singleNo {
    public static int singleNumber(int[] nums) {
        int res = 0;
        for(int val:nums){
            res ^= val;
        }
        return res;

    }
    public static void main(String[] args) {
        int[] nums = {1,1,0,0,2,3,3};
        System.out.println(singleNumber(nums));
    }
}
