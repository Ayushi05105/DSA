package Step6.Recursion;

public class coinChangeII {
    public static int helper(int idx,int amount,int[] coins){
        if(amount ==0) return 1;
        if(amount<0 || idx<0) return 0;
        
        int take =helper(idx, amount-coins[idx], coins);
        int notTake =helper(idx-1, amount, coins);
        
        return take+notTake;

    }
    public static int CoinChange(int amount,int[] coins){
        return helper(coins.length-1, amount, coins);
    }
    public static void main(String[] args) {
        int[] coins ={2,4,10};
        System.out.println(CoinChange(10, coins));
    }
    
}
