package Step1.Lec4;

public class count1 {
    static int count(int n){
        if (n==0) return 1;
        return (int)(Math.log10(n) + 1);
        
    }
    public static void main(String[] args) {
        int n = -123;
        System.out.println(count(n));
    }
    
}
