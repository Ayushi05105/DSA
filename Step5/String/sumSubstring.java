package Step5.String;

public class sumSubstring {
    public static int SubstringSum(String s){
        int sum =0;
        int n =s.length();
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<=s.length();j++){
                String sub = s.substring(i, j);
                sum += Integer.parseInt(sub);
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        String s ="6759";
        System.out.println(SubstringSum(s));
    }
}
