package Assignment.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntersectionofTwoArray {


    //if duplicates not allow

    public static void intersection_array(int[] arr1, int[] arr2){
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int i =0;
        int j =0;
        while(i<arr1.length && j<arr2.length){
            if(arr1[i]==arr2[j]){
                System.out.print(arr1[i] + " ");
                i++;
                j++;
            }
            else if(arr1[i] > arr2[j]){
                j++;
            }
            else if(arr1[i] < arr2[j]){
                i++;
            }
        }
    }

    public static int[] intersection(int[] arr1, int[] arr2){
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int i =0;
        int j = 0;
        List<Integer> list = new ArrayList<>();
        while(i< arr1.length && j < arr2.length){
            if(arr1[i] == arr2[j]){
                if(list.isEmpty() || list.get(list.size()-1) != arr1[i]){
                     list.add(arr1[i]);
                }
                i++;
                j++;
            }
            else if(arr1[i] > arr2[j]){
                j++;
            }
            else{
                i++;
            }
        }
        int[] result = new int[list.size()];
        for(int k =0;k<list.size();k++){
            result[k] = list.get(k);
        }
        return result;
    }

    // if duplicates allows

    public static int[] intersection1(int[] arr1, int[] arr2){
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int i =0;
        int j = 0;
        List<Integer> list = new ArrayList<>();
        while(i< arr1.length && j < arr2.length){
            if(arr1[i] == arr2[j]){
                list.add(arr1[i]);
                i++;
                j++;
            }
            else if(arr1[i] > arr2[j]){
                j++;
            }
            else{
                i++;
            }
        }
        int[] result = new int[list.size()];
        for(int k =0;k<list.size();k++){
            result[k] = list.get(k);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr1={1,3,2,7,9,2,1};
        int[] arr2 = {1,5,2};
        intersection_array(arr1, arr2);  // using void
        System.out.println();
        int[] ans = intersection(arr1, arr2);    //using int[]
        System.out.println(Arrays.toString(ans));
    }
    
}
