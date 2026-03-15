package Step5.String;

public class largestOddNo {
    public static String Largest(String s){
        int n = s.length();
        for(int i =n-1;i>=0;i--){
            int digit = s.charAt(i)-'0';
            if(digit % 2 == 1) return s.substring(0,i+1);
           
        }
        return "";
    }
    public static void main(String[] args) {
        String s = "5437";
        String a = Largest(s);
        System.out.println(a);
    }
}
