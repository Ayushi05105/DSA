package Step1.Lec2;

public class pattern9 {
    static void pattern(int N){
        for(int i =0;i<N;i++){
            for(int j =0;j<N-i-1;j++){
                System.out.print(" ");
            }
        
            for(int j =0;j<2*i+1;j++){
                System.out.print("*");
            }
        
            for(int j =0;j<N-i-1;j++){
                System.out.print(" ");
            }
         System.out.println();
        }
        
    }
    public static void main(String[] args) {
        pattern(5);
    }
    
}
