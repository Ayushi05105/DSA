package Step1.Lec4;
// optimal approach
// time complexity O(log(min(a,b)))
public class GCD2 {
    static void gcd(int a,int b){
        while(a>0 && b>0){
            if(a>b){
                a = a%b;
            }
            else{
                b = b%a;
            }
        }
            if(a==0){
                System.out.println(b + " ");
            }
            else{
                System.out.println(a +" ");
            }
        }
    public static void main(String[] args) {
        int a =52;
        int b = 10;
        gcd(a, b);
    }
    
}
