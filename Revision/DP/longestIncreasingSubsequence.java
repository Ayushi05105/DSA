package Revision.DP;
import java.util.*;
public class longestIncreasingSubsequence {

    public static int subsequence(int[] arr){
        int n = arr.length;
        ArrayList<Integer> temp = new ArrayList<>();
        temp.add(arr[0]);
        for(int i =1;i<n;i++){
            if(arr[i] > temp.get(temp.size()-1)){
                temp.add(arr[i]);
            }
            else{
                int low = 0;
                int high = temp.size()-1;
                while(low<high){
                    int mid =(low+high)/2;
                    if(temp.get(mid) >=arr[i]){
                        high = mid;
                    }
                    else{
                        low = mid+1;
                    }
                }
                temp.set(low,arr[i]);
                
            }
        }
        return temp.size();
    }
    public static void main(String[] args) {
        int[] arr={10,9,2,5,3,7,101,18};
        System.out.println(subsequence(arr));
    }
    
}
