package Assignment.Array;

import java.util.Arrays;
import java.util.Scanner;

public class findRepetedArray {

    // we sort array then compare i and i+1 element if both are same then return
    public static void repetedArray(int[] arr) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1] ) {
                System.out.print(arr[i] + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter n element: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Repeted array are: ");
        repetedArray(arr);
        sc.close();
    }

}
