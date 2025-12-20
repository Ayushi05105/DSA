package Step1.Lec2;

public class pattern11 {
    static void pattern(int n){
        for(int i =0;i<n;i++){
            for(int j =0;j<n-i-1;j++){
                System.out.print(" ");
            }
            for(int j =0;j<2*i+1;j++){
                System.out.print("*");
            }
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    static void inverted(int n){
        for(int i =0;i<n;i++){
            for(int j =0;j<i;j++){
                System.out.print(" ");
            }
            for(int j =0;j< 2*n -(2*i+1) ;j++){
                System.out.print("*");
            }
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
             System.out.println( );
        }
    }

    public static void main(String[] args) {
        pattern(5);
        inverted(5);
    }
    
}
