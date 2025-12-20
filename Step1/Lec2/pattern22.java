package Step1.Lec2;

public class pattern22 {
    static void pattern(int n){
        int sp =0;
        for(int i=0;i<n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print("* ");
            }
            for(int j=0;j<sp;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=n-i;j++){
                System.out.print("* ");
            }
        sp+=2;
        System.out.println();
        }
        sp=2*n-2;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            for(int j=0;j<sp;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            sp-=2;
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pattern(3);
    }
}
//see after that
