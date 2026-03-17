package Step5.String;

public class NestingParanthesis {
    public static int MaxNestingParanthesis(String s){
        int p =0;
        int ans = 0;
        for(char ch : s.toCharArray()){
            if(ch == '(') p++;
            else if(ch == ')') p--;
            ans = Math.max(ans,p);
        }
        return ans;
    }
    public static void main(String[] args) {
        String s = "(1+(2*3)+((8)/4))+1";
        System.out.println(MaxNestingParanthesis(s));
    }
    
}
