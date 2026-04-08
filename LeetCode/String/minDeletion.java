package LeetCode.String;
public class minDeletion{
    

    public static int minDeletions(String s) {
        int totalX = 0;
        for (char c : s.toCharArray()) {
            if (c == 'X') totalX++;
        }

        int leftY = 0;
        int remainingX = totalX;
        int ans = Integer.MAX_VALUE;

        for (char c : s.toCharArray()) {

            if (c == 'X') {
                remainingX--;
            }

            ans = Math.min(ans, leftY + remainingX);

            if (c == 'Y') {
                leftY++;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        System.out.println(minDeletions("YXXXYXY")); 
        System.out.println(minDeletions("YYXYXX"));  
        System.out.println(minDeletions("XXYYYY"));  
    }
}
