package Step10.medium;

import java.util.Arrays;

public class noOfSubstring {
    public static int noOfSubstringGenerating(String s){
        int n = s.length();
        int cnt =0;
        int[] freq = new int[3];
        Arrays.fill(freq,-1);
        for(int i =0;i<n;i++){
            freq[s.charAt(i)-'a'] = i;
            if(freq[0] != -1 && freq[1] != -1 && freq[2] !=-1){
                cnt = cnt + (1 + Math.min(freq[0],Math.min(freq[1],freq[2])));
            }
        }
        return cnt;
    }
    public static void main(String[] args) {
        String s="abcabc";
        System.out.println(noOfSubstringGenerating(s));
    }
    
}
