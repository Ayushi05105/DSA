
public class KokoEatingBanana {
    
    public static long totalHours(int[] piles,int speed){
        long total = 0;
        for(int bananas :piles){
            total += (bananas + speed -1)/speed;

        }
        return total;
    }
    public static int minEatingSpeed(int[] piles, int h) {
        int maxPile = piles[0];
        for(int i =0;i<piles.length;i++){
            if(piles[i]>maxPile){
                maxPile = piles[i];
            }
        }
        int low =1;
        int high = maxPile;
        int ans = maxPile;
        while(low<=high){
            int mid=low + (high - low)/2;
            long total = totalHours(piles,mid);
            if(total<=h){
                ans = mid;
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] piles ={3,6,7,11};
        int h = 18;
        System.out.println(minEatingSpeed(piles, h));
    }
}
