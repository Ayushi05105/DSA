package Assignment.Array;

import java.util.Scanner;

public class findPivotIndex {

    public static void print(int[] arr){
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static int findPivot(int[] arr){
        int totalSum = 0;
        int leftSum = 0;
        for(int i =0;i<arr.length;i++){
            totalSum += arr[i];
        }
        for(int i =0;i<arr.length;i++){
            int rightSum = totalSum-leftSum-arr[i];
            if(leftSum == rightSum) {
                return i;
            }
            leftSum += arr[i];
        }
        return -1;
    }

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the array size: ");
    int n = sc.nextInt();
    int[] arr = new int[n];
    System.out.println("Enter n element: ");
    for(int i =0;i<n;i++){
        arr[i] = sc.nextInt();
    }
    System.out.println("Input Array: ");
    print(arr);
    int ans = findPivot(arr);
    System.out.println("Index of pivot is: ");
    System.out.println(ans);
    sc.close();
    
}
    
}
