package Step6.Recursion;

public class countGoodNo {
    static int mod = 1000000007;
    public static long pow(long x,long n){
        if(n==0) return 1;
        if(n%2==0) return pow((x*x)%mod,n/2);
        return (x*pow((x*x)%mod,n/2))%mod;
    }
    
    public static long CountGoodNumber(int n){
        long even = (n+1)/2;
        long odd = n/2;
        long ans = ((pow(5,even))%mod * (pow(4,odd))%mod)%mod;
        return ans;
    }
    public static void main(String[] args) {
        int n =4;
        System.out.println(CountGoodNumber(n));
    }
    
}
