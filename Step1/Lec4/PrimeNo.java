package Step1.Lec4;

public class PrimeNo {
    static boolean prime(int n){
        int count =0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                count = count +1;
            }
        }
            if(count==2){
                return true;
            }
            else{
                return false;
            }
    }
    public static void main(String[] args) {
        int n=4567;
        boolean isprime = prime(n);
        if(isprime){
            System.out.println(n +" is prime no");
        }
        else{
            System.out.println(n+" is not prime");
        }
    }
    
}
