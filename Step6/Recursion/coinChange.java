package Step6.Recursion;
import java.util.*;

public class coinChange {
    public static void helper(int idx,int[] coins,int amount, List<List<Integer>> ans , List<Integer> ds){
        if(amount ==0){
            ans.add(new ArrayList<>(ds));
            return;
        }
        if(idx < 0|| amount <0) return;
        ds.add(coins[idx]);
        helper(idx, coins, amount-coins[idx], ans, ds);
        ds.remove(ds.size()-1);
        helper(idx-1, coins, amount, ans, ds);
    }
    public static List<List<Integer>> CoinChange(int amount ,int[] coins){
        List<List<Integer>> ans = new ArrayList<>();
        helper(coins.length-1,coins,amount,ans,new ArrayList<>());
        return ans;
    }
    public static void main(String[] args) {
        int[] coins ={2,4,10};
        List<List<Integer>> ans = new ArrayList<>();
        System.out.println(CoinChange(10, coins));
    }
    
}
