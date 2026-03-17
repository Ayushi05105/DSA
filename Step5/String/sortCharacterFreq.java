package Step5.String;

import java.util.*;

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



    // by bucket sort
    public static String FreqSort(String s){
        HashMap<Character,Integer> map = new HashMap<>();
        for(char c:s.toCharArray()){
            map.put(c, map.getOrDefault(c, 0)+1);
        }
        List<Character>[] bucket = new ArrayList[s.length()+1];
        for(char key : map.keySet()){
            int freq = map.get(key);
            if(bucket[freq] == null){
                bucket[freq] = new ArrayList<>();
            }
            bucket[freq].add(key);
        }
        StringBuilder res = new StringBuilder();
        for(int i=bucket.length-1;i>=0;i--){
            if(bucket[i]!=null){
            for(char c:bucket[i]){
                int freq = i;
                while(freq-->0){
                    res.append(c);
                }
            }
        }
    }
    return res.toString();
    }
    public static void main(String[] args) {
        String s ="tree";
        System.out.println(frequencySort(s));
    }
}
