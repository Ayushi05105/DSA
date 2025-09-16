package Step1.Lec2;

public class pattern1 {
    static void pattern(int N){
        for(int i = 0;i<N;i++){
            for(int j =0;j<N;j++){
                System.out.print(" * ");
            }
            System.out.println( );
        }
    }
    public static void main(String[] args) {
        pattern(7);
    }
    
}
