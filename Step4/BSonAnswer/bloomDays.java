
package Step4.BSonAnswer;
public class bloomDays {
    public static boolean isPossible(int[] bloomDay,int day,int m ,int k){
        int count =0;
        int bouquets =0;
        for(int i : bloomDay){
            if(i<= day){
                count++;
                if(count ==k){
                    bouquets++;
                    count =0;
                }
            }else{
                count =0;
            }
        }
        return bouquets>=m;
    }
    public static int minDays(int[] bloomDay, int m, int k) {
        long required = (long) m*k;
        if(required >bloomDay.length) return -1;

        int minDay = Integer.MAX_VALUE;
        int maxDay = Integer.MIN_VALUE;
        for(int i : bloomDay){
            minDay = Math.min(minDay,i);
            maxDay = Math.max(maxDay,i);
        }
        int low = minDay;
        int high = maxDay;
        int result = -1;

        while(low <=high){
            int mid = (low+high)/2;
            if(isPossible(bloomDay,mid,m,k)){
                result = mid;
                high = mid-1;
            }else{
                low = mid +1;
            }
            
        }
        return result;
    }

    public static void main(String[] args) {
        int[] bloomDay={7,7,7,7,12,7,7};
        int m = 3;
        int k =2;
        System.out.println(minDays(bloomDay, m, k));
    }
}
