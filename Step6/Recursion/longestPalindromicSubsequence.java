package Step6.Recursion;

public class longestPalindromicSubsequence {

    public static int lps(String s, int i,int j){
        if(i==j) return 1;
        if(i<j) return 0;
        if(s.charAt(i)==s.charAt(j)){
            return 2+lps(s, i+1, j-1);
        }
        return lps(s,i+1,j)+lps(s,i,j-1);
        
    }
    
}
