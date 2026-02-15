package Step4.BinarySearchOn2D;

public class nthRoot {
    public static int NthRoot(int N, int M) {
        for(int i=1;i<=M;i++){
            long pow = (long)Math.pow(i,N);
            if(pow ==M) return i;
            if(pow>M) break;
        }
        return -1;
    }


public static void main(String[] args) {
 int N =3;
 int M = 27;
 System.out.println(NthRoot(N, M)); 
} 
}
