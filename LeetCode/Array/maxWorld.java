package LeetCode.Array;

public class maxWorld {
    public int mostWordsFound(String[] sentences) {
        int count = 0;
        for(String s : sentences){
            int spaces =0;
        for(int i =0;i<s.length();i++){
            if(s.charAt(i) == ' '){
                spaces++;
            }
        }
        int words = spaces+1;
        count = Math.max(count,words);
        }
        return count;
    }
    
}
