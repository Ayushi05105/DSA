package Step6.Recursion;

public class mypow {

    public static double helper(double x, int n){
        if(n==0) return 1;
        if(n %2 ==0) return helper(x*x,n/2);
        return x * helper(x*x,n/2);
    }

    public static double myPow(double x,int n){
        if(n<0){
            double ans = 1/helper(x,-n);
            return ans;
        }
        return helper(x,n);
    }
    public static void main(String[] args) {
        double x = 2.00000;
        int n = -2;
        System.out.println(myPow(x, n));
    }
    
}
