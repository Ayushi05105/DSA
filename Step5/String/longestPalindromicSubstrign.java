package Step5.String;

public class longestPalindromicSubstrign {
    public static boolean palindrome(String s){
        int j = s.length()-1;
        int i =0;
        while(i<j){
            if(s.charAt(i) != s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }


    // o(n^3) solution
    public static String LongestPalindromicStr(String s){
        String ans ="";
        int n = s.length();
        for(int i =0;i<n;i++){
            String temp ="";
            for(int j =i ;j<n;j++){
                temp +=s.charAt(j);
                if(palindrome(temp) && temp.length()>ans.length()){
                    ans = temp;
                }
            }
        }
        return ans;
    }

    // public static String LongestPalindromicStr2(String s){
    //     int n = s.length();
    //     int low,high;
    //     for(int i =1;i<n;i++){
    //         low = i;
    //         high = i;
    //         while((low>=0 && high <n) && s.charAt(low) == s.charAt(high)){
    //             low--;
    //             high++;
    //         }

    //     }
    // }

    public static void main(String[] args) {
        String s ="babad";
        System.out.println(LongestPalindromicStr(s));
    }
    
}
