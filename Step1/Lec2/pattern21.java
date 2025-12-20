package Step1.Lec2;

public class pattern21 {
    static void pattern(int n){
        for(int i=0;i<n;i++){
            for(char ch = (char)(int)('A'+n-1-i);ch<=(char)(int)('A'+n-1);ch++){
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pattern(6);
    }
    
}
