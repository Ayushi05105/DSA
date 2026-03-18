package Step5.String;

public class aToI {
    public static int aToIproblem(String s){
       
        int i=0;
        int n = s.length();
        while(i<n && s.charAt(i)==' '){
            i++;
        }
        int sign =1;
        if(i<n && (s.charAt(i)=='+' || s.charAt(i) =='-')){
            if(s.charAt(i) =='-'){
                sign =-1;
            }
            i++;
        }
        int res =0;
        while(i<n && Character.isDigit(s.charAt(i))){
            int digit = s.charAt(i)-'0';
            if(res > (Integer.MAX_VALUE - digit)/10){
                if(sign ==1) return Integer.MAX_VALUE;
                else return Integer.MIN_VALUE;
            }
             res = res*10 + digit;
             i++;
        }
        return res * sign;
        
    }

    public static void main(String[] args) {
        String s =" -12a3abc";
        System.out.println(aToIproblem(s));
    }
    
}
