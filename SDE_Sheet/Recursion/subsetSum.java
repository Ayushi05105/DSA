package SDE_Sheet.Recursion;

import java.util.*;
public class subsetSum {

    public static void helper(int idx,int sum,ArrayList<Integer> arr,int N,ArrayList<Integer> subset){
        if(idx ==N){
            subset.add(sum);
            return;
        }
        helper(idx+1, sum+arr.get(idx), arr, N, subset);
        helper(idx+1, sum, arr, N, subset);
    }

    public static ArrayList<Integer> getSubsetSums(ArrayList<Integer> arr,int N){
        ArrayList<Integer> subset = new ArrayList<>();
        helper(0, 0, arr, N, subset);
        Collections.sort(subset);
        return subset;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 3));
        int N = 3;
        ArrayList<Integer> res = getSubsetSums(arr, N);
        for(int sum : res){
            System.out.print(sum+" ");
        }
        System.out.println();
    }
    
}
