package Step2.Array.medium;

import java.util.HashMap;

public class majorityElement {

    // moore's voting algorithm

    //better approach
    public static int majorElement(int[] arr){
        int n = arr.length;
       HashMap<Integer,Integer> map = new HashMap<>();
       for(int num:arr){
      //  map.put(num,map.getOrDefault(num,0)+1);
      if(map.containsKey(num)){
        map.put(num,map.get(num)+1);
      }else{
        map.put(num, 1);
      }

       }

       for(int key :map.keySet()){
        if(map.get(key) >n/2){
            return key;
        }
       }
       return -1;
    }


    //optimise approach
    public static int majorityElement2(int[] arr){
        int n = arr.length;
        int count =0;
        int ele = 0;
        for(int i=0;i<n;i++){
            if(count ==0){
                count=1;
                ele = arr[i];
            }else if(ele == arr[i]){
                count++;
            }else{
                count--;
            }
        }
        int count1 =0;
        for(int i =0;i<n;i++){
            if(arr[i]==ele){
                count1++;
            }
        }
        if(count1 >(n/2)){
            return ele;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {2,2,1,1,1,2,2};
        System.out.println(majorElement(arr));
    }

}
