package Step5.String;

public class reverse {
    
    public static void reverseString(char[] s) {
        int left =0;
        int right = s.length-1;
        while(left<right){
            int temp = left;
            left = right;
            right = temp;
            left++;
            right--;
        }
    }
    public static void main(String[] args) {
        
    }
}

    

