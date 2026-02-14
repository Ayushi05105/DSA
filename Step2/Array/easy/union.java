package Step2.Array.easy;

import java.util.ArrayList;
import java.util.List;

public class union {

    public static ArrayList<Integer> unionSortedArray(int[] arr1,int[] arr2){
        ArrayList<Integer> union = new ArrayList<>();
        int n = arr1.length;
        int m = arr2.length;
        int i =0,j=0;
        while(i<n && j<m){
            if(arr1[i] < arr2[j]){
                if(union.isEmpty() || union.get(union.size()-1)!=arr1[i]){
                    union.add(arr1[i]);
                }
            i++;
            }
            else if(arr1[i] > arr2[j]){
                if(union.isEmpty() || union.get(union.size()-1)!=arr2[j]){
                    union.add(arr2[j]);
                }
            j++;
            }
            else{
            if(union.isEmpty() || union.get(union.size()-1)!=arr1[i]){
                    union.add(arr1[i]);
                }
            i++;
            j++;
            }
        }
        while(i<n){
            if(union.isEmpty() || union.get(union.size()-1)!=arr1[i]){
                    union.add(arr1[i]);
                }
            i++;
        }
        while(j<m){
            if(union.isEmpty() || union.get(union.size()-1)!=arr2[j]){
                    union.add(arr2[j]);
                }
            j++;
        }
        return union;
    }
    public static void main(String[] args) {
        int[] arr1 ={1,2,3,4,7,5};
        int[] arr2 = {3,4,5,6,7,0};
        List<Integer> res = union.unionSortedArray(arr1,arr2);
        for(int val : res) System.out.print(val +" ");
    }
    
}
