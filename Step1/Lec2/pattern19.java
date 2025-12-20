package Step1.Lec2;

public class pattern19 {
    static void pattern(int n){
        for(int i=0;i<n;i++){
            char ch = (char)('A' + i);
            for(char j=0;j<=i;j++){
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pattern(5);
    }
    
}
