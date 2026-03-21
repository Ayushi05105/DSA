package Step6.Recursion;
import java.util.*;

public class subsetSum {
    public static void helper(int idx,int sum,int N,ArrayList<Integer> arr,ArrayList<Integer> ds){
        if(idx == N){
            ds.add(sum);
            return;
        }
        helper(idx+1, sum+arr.get(idx), N, arr, ds);
        helper(idx+1, sum, N, arr, ds);
    }
    public static ArrayList<Integer> SubsetSum(ArrayList<Integer> arr,int N){
        ArrayList<Integer> ds = new ArrayList<>();
        helper(0, 0, N, arr, ds);
        Collections.sort(ds);
        return ds;        
    }
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(3,1,2));
        System.out.println(SubsetSum(arr, arr.size()));
    }
    
}
