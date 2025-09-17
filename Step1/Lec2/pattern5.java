package Step1.Lec2;

public class pattern5 {
    static void pattern(int N){
        for(int i =0;i<N;i++){
            for(int j =0;j<i+1;j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pattern(5);
    }
    
}
