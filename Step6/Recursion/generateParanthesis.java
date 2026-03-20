package Step6.Recursion;

import java.util.ArrayList;
import java.util.List;

public class generateParanthesis {
    public static void helper(int n ,int open,int close,List<String> res,String curr){
        if(curr.length()==2*n){
            res.add(curr);
            return;
        }
        if(open<n){
            helper(n, open+1, close, res, curr+'(');
        }
        if(close<open){
            helper(n, open, close+1, res, curr +')');
        }
    }
    public static List<String> generateValidParanthesis(int n){
        List<String> res = new ArrayList<>();
        helper(n, 0, 0, res, "");
        return res;
    }
    public static void main(String[] args) {
        System.out.println(generateValidParanthesis(3));
    }
    
}
