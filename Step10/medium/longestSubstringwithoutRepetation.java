package Step10.medium;

import java.util.Arrays;

public class longestSubstringwithoutRepetation {

    public static int longestSubstring(String s){
        int[] hash = new int[256];
        Arrays.fill(hash,-1);
        int n = s.length();
        int l =0;
        int r =0;
        int maxLen =0;
        while(r<n){
            if(hash[s.charAt(r)] != -1){
                if(hash[s.charAt(r)] >=l){
                    l = hash[s.charAt(r)]+1;
                }
            }
            int len = r-l+1;
            maxLen = Math.max(len,maxLen);
            hash[s.charAt(r)] = r;
            r++;
        }
        return maxLen;
    }

    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(longestSubstring(s));
    }
    
}
