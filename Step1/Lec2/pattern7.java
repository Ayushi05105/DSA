package Step1.Lec2;

public class pattern7 {
    static void pattern(int N){
        for(int i =0;i<N;i++){
            for(int j =N;j>i;j--){
                System.out.print(N-j+1 + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pattern(6);
    }
    
}
