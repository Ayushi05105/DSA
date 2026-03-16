package Step5.String;

import java.util.ArrayList;
import java.util.List;

public class findAndReplace {
    public static boolean matching(String word, String pattern){
        int[] word1 = new int[256];
        int[] pattern1 = new int[256];
        for(int i =0;i<word.length();i++){
            if(word1[word.charAt(i)]!= pattern1[pattern.charAt(i)]) return false;
            word1[word.charAt(i)] = i+1;
            pattern1[pattern.charAt(i)] = i+1;
        }
        return true;
    }
    public static List<String> findAndReplacePattern(String[] word,String pattern){
        List<String> res = new ArrayList<>();
        for(String num : word){
            if(matching(num, pattern)){
                res.add(num);
            }
        }
        return res;
    }
    public static void main(String[] args) {
       String[] words = {"abc","deq","mee","aqq","dkd","ccc"};
       String pattern = "abb";
       System.out.println(findAndReplacePattern(words, pattern));
    }
}
