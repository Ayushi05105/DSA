package LeetCode.Array;

public class shuffleString {
    public static String restoreString(String s, int[] indices) {
        char[] res = new char[s.length()];
        for(int i =0;i<s.length();i++){
            res[indices[i]] = s.charAt(i);
        }
        return new String(res);
    }
    public static void main(String[] args) {
        String s = "codeLeet";
        int[] indices = {4,5,6,7,0,1,2,3};
        System.out.println(restoreString(s, indices));
        }
    
}
