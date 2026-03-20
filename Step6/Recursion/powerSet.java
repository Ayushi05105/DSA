package Step6.Recursion;

public class powerSet {
    public static void PowerSet(String s){
        int n = s.length();
        for(int num =0;num<(1<<n);num++){
            String sub ="";
            for(int i =0;i<n;i++){
                if((num &(1<<i))!=0){
                    sub += s.charAt(i);
                }
            }
            System.out.print(sub+" ");
        }
    }
    public static void main(String[] args) {
        String s ="abc";
        PowerSet(s);
    }
}
