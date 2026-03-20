package Step6.Recursion;

public class countGoodNo {
    static long mod = 1000000007;
    public static long pow(long x,long n){
        if(n==0) return 1;
        if(n%2==0) return pow((x*x)%mod,n/2);
        return (x*pow((x*x)%mod,n/2))%mod;
    }
    
    public static long CountGoodNumber(int n){
        long even = (n+1)/2;
        long odd = n/2;
        long ans = ((pow1(5,even))%mod * (pow1(4,odd))%mod)%mod;
        return ans;
    }

    //iterative method
    public static long pow1(long x,long n){
        long res =1;
        if(n==0) return 1;
        while(n>0){
           if(n%2==1) res = (res*x)%mod;
           x = (x*x)%mod;
           n = n/2;
        }
        
        return res;
    }
    
    public static void main(String[] args) {
        int n =4;
        System.out.println(CountGoodNumber(n));
    }
    
}
