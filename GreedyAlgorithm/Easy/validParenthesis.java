package GreedyAlgorithm.Easy;

public class validParenthesis {

    public static boolean CheckValidParenthesis(String s) {
        int n = s.length();
        int minopen = 0;
        int maxopen = 0;
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (ch == '(') {
                minopen++;
                maxopen++;
            } else if (ch == ')') {
                minopen--;
                maxopen--;
            } else {
                minopen--;
                maxopen++;
            }
            if (maxopen < 0)
                return false;
            if (minopen < 0)
                minopen = 0;
        }
        return minopen == 0;
    }
    public static void main(String[] args) {
        String s ="(*))";
        
        boolean ans =CheckValidParenthesis(s);
        System.out.println(ans);
    }

}
