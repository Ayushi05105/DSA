package Step5.String;

public class maxFreq {
    
    public static char getMaxFreq(String s){
        int n = s.length();
        int[] freq = new int[26];
        for(int i =0;i<n;i++){
            char ch = s.charAt(i);
            int idx = ch-'a';
            freq[idx]++;
        }
        int maxFreq = 0;
        char ans = s.charAt(0);
        for(int i =0;i<26;i++){
            if(freq[i]>maxFreq){
                maxFreq = freq[i];
                ans = (char)(i+97);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        String s = "ayushijaiswal";
        System.out.println(getMaxFreq(s));
    }
}
