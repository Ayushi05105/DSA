package Step2.Array.medium;

import java.util.ArrayList;
import java.util.Collections;

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

    public static ArrayList<Integer> leader1(int[] arr){
        int n = arr.length;
        ArrayList<Integer> ans = new ArrayList<>();
        if(arr.length ==0){
            return ans;
        }
        int max = arr[n-1];
        ans.add(arr[n-1]);
        for(int i =n-2;i>=0;i--){
            if(arr[i] > max){
                ans.add(arr[i]);
                max = arr[i];
            }
        }
        Collections.reverse(ans);
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {-3,4,5,1,-4,-5};
        System.out.println(leaders(arr));
        System.out.println(leader1(arr));
    }
    
}
