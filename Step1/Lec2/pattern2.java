package Step1.Lec2;

public class pattern2 {
    static void pattern(int N){
        for(int i = 0;i<N;i++){
            for(int j = i;j<N;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pattern(8);
    }
    
}
