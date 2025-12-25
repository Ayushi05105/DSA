package Assignment.Array;

public class MajorityElement {

//moore's voting algorithm
     public static int majorityElement(int[] nums) {
       int cnt =0;
       int el =0;
       for(int i =0;i<nums.length;i++){
        if(cnt == 0){
            cnt = 1;
            el=nums[i];
        }
        else if(nums[i]==el){
            cnt++;
        }
        else{
            cnt--;
        }
       }
       int cnt1 =0;
       for(int i =0;i<nums.length;i++){
        if(nums[i] == el) cnt1++;
       }
        if(cnt1 > nums.length/2){
             return el;
        }
       return -1;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,5,2,3,5,6,5,5,5,5,5};
        System.out.println(majorityElement(nums));
    }
    
}
