package Step1.Lec2;

public class pattern4 {
    static void pattern(int N){
        for(int i = 1;i<=N;i++){
            for(int j =1;j<=i;j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
            pattern(5);
    }
}
