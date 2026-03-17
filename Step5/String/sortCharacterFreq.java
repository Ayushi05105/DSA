package Step5.String;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

public class sortCharacterFreq {
    public static String frequencySort(String s){
        HashMap<Character,Integer> map = new HashMap<>();
        for(char c:s.toCharArray()){
            map.put(c, map.getOrDefault(c, 0)+1);
        }
        List<Character> list = new ArrayList<>(map.keySet());
        Collections.sort(list,new Comparator<Character>(){
            public int compare(Character a,Character b){
                return map.get(b) - map.get(a);
            }
        });
        StringBuilder res = new StringBuilder();
        for(char c : list){
            int freq = map.get(c);
            while(freq-- >0){
                res.append(c);
            }
        }
        return res.toString();
    }
    public static void main(String[] args) {
        String s ="tree";
        System.out.println(frequencySort(s));
    }
}
