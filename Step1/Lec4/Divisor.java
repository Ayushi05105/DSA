package Step1.Lec4;

public class Divisor {
    static void divisor(int n){
        for(int i=1;i<=n;i++){
            if(n%i==0){
                System.out.print(i+" ");
            }
        }
    }
    public static void main(String[] args) {
        int n= 36;
        divisor(n);
    }
}
