package Assignment.Array;

public class maxFreqArray {

    public static int maxFreq(int[] arr){
        int freq[] = new int[101];
        int maxFreq = 0;
        int sumFreq = 0;
        for(int element : arr){
            freq[element]++;
            int currFreq = freq[element];
            if(currFreq > maxFreq){
                maxFreq = currFreq;
                sumFreq = currFreq;
            }
            else if(currFreq == maxFreq){
                sumFreq += currFreq;
            }
        }
        return sumFreq;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,1,2,2,3,4};
        System.out.println(maxFreq(arr));
    }
    
}
