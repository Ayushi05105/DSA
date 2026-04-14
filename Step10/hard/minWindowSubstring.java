package Step10.hard;
public class minWindowSubstring {
    public static String minimum_Window_Substring(String s, String t){
        int n = s.length();
        int m = t.length();
        
        int sIndex = -1;
        int minLen = Integer.MAX_VALUE;
        for(int i =0;i<n;i++){
            int[] hash = new int[256];
            for(char c:t.toCharArray()){
                hash[c]++;
            }
            int cnt =0;
            for(int j =i;j<n;j++){
                hash[s.charAt(j)]--;
                if(hash[s.charAt(j)]>=0){
                    cnt ++;
                }
                if(cnt == m){
                    if(j-i+1<minLen){
                        minLen = j-i+1;
                        sIndex = i;
                    }
                    break;
                }
            }
        }
        if(sIndex == -1) return"";
        return s.substring(sIndex, sIndex+minLen);
    }
    public static void main(String[] args) {
        String s ="ADOBECODEBANC";
        String t = "ABC";
        String ans = minimum_Window_Substring(s, t);
        System.out.println(ans);
    }
    
}
