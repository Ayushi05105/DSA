package Step5.String;

import java.util.HashMap;

public class wordPattern {
    public static boolean WordPattern(String pattern , String s){
        String[] word = s.split(" ");
        if(pattern.length()!= word.length) return false;
        int[] pattern1 = new int[256];
        HashMap<String,Integer> map = new HashMap<>();
        for(int i =0;i<pattern.length();i++){
            char p = pattern.charAt(i);
            String w = word[i];
            if(pattern1[p] != map.getOrDefault(w,0)){
                return false;
            } 
            pattern1[p] = i+1;
            map.put(w,i+1);
        }
        return true;
    }
    public static void main(String[] args) {
        String pattern ="abba";
        String s = "dog hello hello dog";
        boolean res = WordPattern(pattern, s);
        System.out.println(res);
    }
}
