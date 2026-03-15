package Step5.String;

public class vowel {
    public static void NoofVowel(String s ){
        int count =0;
        for(int i =0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='a' || ch =='e' || ch=='i' || ch=='o' || ch=='u'||
            ch=='A' || ch =='E' || ch=='I' || ch=='O' || ch=='U'){
                count++;
            }
        }
        // return count;
        System.out.println(count);
    }
    public static boolean palindrome(String s){
       int i =0;
       int j= s.length();
       while(i<=j){
        if(s.charAt(i)!=s.charAt(j)) return false;
        i++;
        j--;
       }
       return true;
    }
    public static int compareTo(String a,String b){
        int n = Math.min(a.length(),b.length());
        for(int i =0;i<n;i++){
                if(a.charAt(i)!=b.charAt(i)){
                    return a.charAt(i)-b.charAt(i);
                }                
            }
       return a.length()-b.length();

        }
    

    public static void main(String[] args) {
        String s = "Ayushi";
        NoofVowel(s);
        palindrome(s);
    }
}
