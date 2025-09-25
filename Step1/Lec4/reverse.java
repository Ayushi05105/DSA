package Step1.Lec4;

public class reverse {
    static void reverseNum(int n){
        int sum=0;
        while (n>0) {
                int last=n%10;
                 sum=sum*10+last;
                n=n/10;
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        int n  = 123400;
        reverseNum(n);
    }
    
}
