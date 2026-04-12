package Step10.medium;
import java.util.*;

public class fruitIntoBasket {

    public static int FruitInBasket(int[] arr){
        int n = arr.length;
        int left = 0;
        int maxLen = 0;
        Map<Integer,Integer> map = new HashMap<>();
        for(int right =0;right<n;right++){
                map.put(arr[right],map.getOrDefault(arr[right], 0)+1);
                while(map.size()>2){
                    map.put(arr[left], map.getOrDefault(arr[left], 0)-1);
                    if(map.get(arr[left])==0){
                        map.remove(arr[left]);
                    }
                    left++;
                }
                
                maxLen = Math.max(maxLen,right-left+1);
            
            } 
            return maxLen;
        }
        public static void main(String[] args) {
            int[] arr ={3,3,3,1,2,1,1,2,3,3,4};
            System.out.println(FruitInBasket(arr));
            
        }
    
}
