package LeetCode.Array;

public class subtractProdSum {
    public static int subtractProductAndSum(int n) {
        int sum =0;
        int product = 1;
        while(n>0){
            int digit = n%10;
            sum += digit;
            product *= digit;
            n = n/10;
        }
        return product - sum;
    }
    public static void main(String[] args) {
        int n = 243;
        System.out.println(subtractProductAndSum(n));
    }
    
}
