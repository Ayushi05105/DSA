package Step5.String;

public class IntegerToRoman {
    public static String integerToRoman(int num){
        int[] val ={1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String [] romans={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        StringBuilder res = new StringBuilder();
        for(int i =0;i<val.length;i++){
            while(num >=val[i]){
                res.append(romans[i]);
                num -= val[i];
            }
        }
        return res.toString();
    }
    public static void main(String[] args) {
        int num =1994;
        System.out.println(integerToRoman(num));
    }
    
}
