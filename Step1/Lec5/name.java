package Step1.Lec5;

public class name {
    static void func(int i,int n){
        if(i>n) return;
        System.out.println("Ayushi ");
        func(i+1,n);
    }
    public static void main(String[] args) {
        int n =7;
        func(1, n);
    }
    
}
