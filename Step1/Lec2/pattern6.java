package Step1.Lec2;

public class pattern6 {
    static void pattern(int N){
        for(int i =1;i<N;i++){
            for(int j = i;j<N;j++){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pattern(5);
    }
}
