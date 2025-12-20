package Step1.Lec4;
//better approach but time compexity bad
public class GCD1 {
    static void gcd(int n1,int n2){
        for(int i=Math.min(n1,n2);i>=1;i--){
            if(n1 %i ==0 && n2 %i==0){
                System.out.println(i +" ");
                break;
            }
        }
    }
    public static void main(String[] args) {
        int n1 =52;
        int n2 = 10;
        gcd(n1, n2);
    }
    
}
