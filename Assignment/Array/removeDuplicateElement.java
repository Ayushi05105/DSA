package Assignment.Array;

import java.util.Scanner;
//leetcode26
//https://leetcode.com/problems/remove-duplicates-from-sorted-array/

public class removeDuplicateElement {
    public static int removeDuplicate(int[] arr){
        int i =0;
        for(int j = 1 ; j<arr.length ; j++){
            if(arr[i] != arr[j]){
                i++;
                arr[i] = arr[j];
            }
        }
        return i+1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the element: ");
        for(int i =0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Duplicate array: ");
        System.out.println(removeDuplicate(arr));
        sc.close();

    }
    
}
