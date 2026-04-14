package Step6.Recursion;


import java.util.List;

public class longestCommonSubsequence {

    public static void helper(int idx,StringBuilder ans,String s,List<String> ds){
        if(idx == s.length()){
            ds.add(ans.toString());
            return;
        }
        helper(idx+1,ans,s,ds);
        ans.append(s.charAt(idx));
        helper(idx+1,ans,s,ds);
        ans.deleteCharAt(ans.length()-1);
        
    }

    public static StringBuilder LongestCommon(String s1){
       // List<String> result = new ArrayList<>();
        StringBuilder ans = new StringBuilder();
        // helper(0, 0, s1, result);
         return ans;

    }
    
}
