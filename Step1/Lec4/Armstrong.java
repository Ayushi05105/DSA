package Step1.Lec4;

public class Armstrong {

    static void armstrongNo(int n){
        int sum =0;
        int revNum =0;
        int dupl = n;
        while(n>0){
            int ld = n%10;
            sum = sum + (ld * ld * ld);
            n = n/10;
            revNum = (revNum *10) + ld;
        }
        if(sum == dupl){
            System.out.println("The given no. is Armstrong");
        }
        else{
            System.out.println("The given no. is not Armstrong");
        }
    }
    public static void main(String[] args) {
        int n =1634;
        armstrongNo(n);
    }
    
}
