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

    public static void helper(String s,int idx,String curr){
        if(idx != s.length()){
            System.out.println(curr+" ");
            return;
        }
            helper(s, idx+1, curr+s.charAt(idx));
            helper(s, idx+1, curr);
       
    }

    public static void PowerSet1(String s){
        helper(s, 0, "");
    }
    public static void main(String[] args) {
        String s ="abc";
        PowerSet(s);
        PowerSet1(s);
        
    }
}
