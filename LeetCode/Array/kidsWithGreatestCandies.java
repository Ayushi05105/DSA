package LeetCode.Array;

import java.util.ArrayList;
import java.util.List;

public class kidsWithGreatestCandies {
        public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int n = candies.length;
        int mx =0;
        for(int i =0;i<n;i++){
            if(candies[i]>mx){
                mx = candies[i];
            }
        }
        List<Boolean> ans = new ArrayList<>();
        for(int i =0;i<n;i++){
            if(candies[i]+extraCandies >=mx){
                ans.add(true);
            }
            else{
                ans.add(false);
            }
        }
        return ans;
    }
}
