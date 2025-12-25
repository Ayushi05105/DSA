package Assignment.String;

public class count {

    public static void vowel_consonent_whitespace(String s){
        int vowel =0;
        int consonent =0;
        int whiteSpace = 0;
        s = s.toLowerCase();
        for(int i =0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                vowel++;
            }
            else if(ch>='a' && ch<='z'){
                consonent++;
            }
            else if(ch==' '){
                whiteSpace++;
            }
        }
        System.out.println("vowels: "+ vowel);
        System.out.println("consonent: "+ consonent);
        System.out.println("whiteSpace: "+ whiteSpace);


    }

    public static void main(String[] args) {
        String s ="You can do it.";
        vowel_consonent_whitespace(s);

    }
    
}
