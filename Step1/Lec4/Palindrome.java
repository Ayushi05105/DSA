package Step1.Lec4;

public class Palindrome {

    static boolean palindrome(int n){
        int revNum = 0;
        int dupl = n;
        while(n>0){
            int ld = n%10;
            revNum = (revNum*10)+ld;
            n=n/10;
        }
        if(dupl ==revNum){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {
        int n = 45665;
        if(palindrome(n)){
            System.out.println(n + " is palindrome");
        }
        else{
            System.out.println(n + " is not palindrome");
        }

    }
    
}
