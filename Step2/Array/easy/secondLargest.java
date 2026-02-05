package Step2.Array.easy;

public class secondLargest {

    // brute force approach is we sort the arr and return n-1 index element

    // better approach

    public static int secondLargestElement(int[] arr){
        int n = arr.length;
        int largest = arr[0];
        for(int i = 0;i<n;i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
        }
        int secondLargest = -1;
        for(int i =0;i<n;i++){
            if(arr[i] > secondLargest && arr[i] !=largest){
                secondLargest = arr[i];
            }
            
        }
        return secondLargest;
    }

    // optimal approach
    public static int secondLargest2(int[] arr){
        int largest = arr[0];
        int secondLargest = -1;
        int n = arr.length;
        for(int i = 0;i<n;i++){
            if(arr[i]>largest){
                secondLargest = largest;
                largest = arr[i];
                
            }
            else if(arr[i] <largest && arr[i] >secondLargest){
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }
    public static void main(String[] args) {
        int[] arr = {2,3,8,9,4,6,7};
        System.out.println(secondLargestElement(arr));
        System.out.println(secondLargest2(arr));
    }
    
}
