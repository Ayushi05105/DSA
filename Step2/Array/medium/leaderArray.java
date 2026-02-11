package Step2.Array.medium;

import java.util.ArrayList;

public class leaderArray {

    public static ArrayList<Integer> leaders(int[] arr){
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = 0;i<arr.length;i++){
            boolean leader = true;
            for(int j =i+1;j<arr.length;j++){
                if(arr[j]>=arr[i]){
                    leader = false;
                    break;
                }
            }
            if(leader){
                ans.add(arr[i]);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {-3,4,5,1,-4,-5};
        System.out.println(leaders(arr));
    }
    
}
