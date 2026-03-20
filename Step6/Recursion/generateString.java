package Step6.Recursion;

import java.util.ArrayList;
import java.util.List;

public class generateString {
    public static void generateBinaryString(int n, String curr,List<String> res){
        if(curr.length()==n){
            res.add(curr);
            return;
        }
        generateBinaryString(n, curr+"0", res);

        if(curr.length()==0 || curr.charAt(curr.length()-1) != '1'){
            generateBinaryString(n, curr+"1", res);
        }
    }
    public static void main(String[] args) {
        int n =4;
        List<String> res = new ArrayList<>();
        generateBinaryString(n, "", res);
        System.out.println(res);
    }
    
}
