package Step1.Lec2;

public class pattern14 {
    static void pattern(int n){
        int N=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<i+1;j++){
                System.out.print(N+" ");
                N=N+1;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pattern(5);
    }
    
}
