

public class count_Inversion {

    public static int inversion(int[] arr){
        int n = arr.length;
        int cnt =0;
        for(int i =0;i<n;i++){
            for(int j =i+1;j<n;j++){
                if(arr[i]>arr[j]){
                cnt++;
            }
            }
            
        }
        return cnt;
    }


    // public static int inversion2(int[] arr){
    //     int n = arr.length;
    //     int left =0;
        
    // }
    public static void main(String[] args) {
        int[] arr={5,3,2,1,4};
        System.out.println(inversion(arr));
    }
    
}
