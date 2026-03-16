package Step5.String;

import java.util.HashMap;
import java.util.HashSet;

public class isomorphic {
    //TC->O(n^2)   SC->O(N)
    public static boolean isomorphicString(String s, String t){
        HashMap<Character,Character> map = new HashMap<>();
        for(int i =0;i<s.length();i++){
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);
            if(map.containsKey(c1)){
                if(map.get(c1)!=c2) return false;
            }
            else{
                
                map.put(c1,c2);
            }
        }
        return true;
    }
    //TC->O(n)  SC->O(n)
    public static boolean isomorphicString1(String s, String t){
        HashMap<Character,Character> map = new HashMap<>();
        HashSet<Character> st = new HashSet<>();
        for(int i =0;i<s.length();i++){
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);
            if(map.containsKey(c1)){
                if(map.get(c1)!=c2) return false;
            }
            else if(st.contains(c2)){
                return false;
            }
            else{
                map.put(c1,c2);
                st.add(c2);
            }
        }
        return true;
    }
    // TC->O(n)  SC->O(1)
    public static boolean isomorphicString2(String s,String t){
        int[] s1 = new int[256];
        int[] t1 = new int[256];
        for(int i =0;i<s.length();i++){
            if(s1[s.charAt(i)] != t1[t.charAt(i)]){
                return false;
            }
            s1[s.charAt(i)] = i+1;
            t1[t.charAt(i)] = i+1;
            
        }
        return true;
    }
    public static void main(String[] args) {
        String s ="paper";
        String t = "title";
        boolean result = isomorphicString(s, t);
        System.out.println(result);
        boolean res1 = isomorphicString(s, t);
        System.out.println(res1);
    }
    
}
