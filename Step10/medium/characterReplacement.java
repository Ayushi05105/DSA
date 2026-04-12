package Step10.medium;

public class characterReplacement {

    public static int Replacement(String s, int k){
        int n = s.length();
        int left = 0;
        int maxLen =0;
        int[] freq = new int[26];
        int ans =0;
        for(int right =0;right<n;right++){
           char ch = s.charAt(right);
           freq[ch-'A']++;
           maxLen = Math.max(maxLen,freq[ch-'A']);
           while((right-left+1)-maxLen > k){
            freq[s.charAt(left)-'A']--;
            left++;
           }
           ans = Math.max(ans,right-left+1);
        }
        return ans;
    }
    public static void main(String[] args) {
        String s = "AABABBA";
        System.out.println(Replacement(s, 1));
    }
    
}
