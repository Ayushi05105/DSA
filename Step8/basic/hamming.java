package Step8.basic;

public class hamming {
    public static int hammingWeight(int n) {
      String binary = "";
      while(n>0){
        int rem = n%2;
        binary = rem + binary;
        n = n/2;
      }  
      int count =0;
      for(int i =0;i<binary.length();i++){
        if(binary.charAt(i)=='1') count++;
      }
      return count;
    }
    public static void main(String[] args) {
        int n = 11;
        System.out.println(hammingWeight(n));
    }
    
    
}
