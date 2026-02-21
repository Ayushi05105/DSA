package Step4.BSonAnswer;

public class sqrt {
    public static int floorSqrt(int n) {
      int ans =0;
      for(int i =1;i<=n;i++){
        if((long)(i)*i<=n){
            ans = i;
        }
        else{
            break;
        }
      }
      return ans;
    }

    public static void main(String[] args) {
        int n = 50;
        System.out.println(floorSqrt(n));
    }
}
    
