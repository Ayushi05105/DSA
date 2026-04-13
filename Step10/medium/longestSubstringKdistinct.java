package Step10.medium;

import java.util.HashMap;


// brute force approach
public class longestSubstringKdistinct {
    public static int longestSubstring_K_distinctChar(String s, int k) {
        int maxLen = 0;
        int n = s.length();
        for (int i = 0; i < n; i++) {
            HashMap<Character, Integer> map = new HashMap<>();
            for (int j = i; j < n; j++) {
                map.put(s.charAt(j), map.getOrDefault(s.charAt(j), 0) + 1);
                if (map.size() > k)
                    break;
                maxLen = Math.max(maxLen, j - i + 1);
            }

        }
        return maxLen;
    }


    //optimal approach
    public static int longestSubstring(String s,int k){
        int maxLen =0;
        int left =0;
        int right = 0;
        int n = s.length();
        HashMap<Character,Integer> map = new HashMap<>();
        while(right<n){
            map.put(s.charAt(right),map.getOrDefault(s.charAt(right), 0)+1);
            if(map.size()>k){
                map.put(s.charAt(left),map.get(s.charAt(left))-1);
                if(map.get(s.charAt(left))==0){
                    map.remove(s.charAt(left));
                }
                left++;
            }
            maxLen = Math.max(maxLen,right-left+1);
            right++;
        }
        return maxLen;
    }

    public static void main(String[] args) {
        String s = "aababbcaacc";
        System.out.println(longestSubstring_K_distinctChar(s, 2));
        System.out.println(longestSubstring(s, 2));
    }

}
