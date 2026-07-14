package SDE_Sheet.binarySearch;

public class findMedian {
    public static int helper(int[] row,int x){
        int low =0;
        int high = row.length;
        while(low<high){
            int mid = low+(high-low)/2;
            if(row[mid]<=x) low = mid+1;
            else high = mid;
        }
        return low;
    }
    public static int median(int[][] matrix){
        int n = matrix.length;
        int m = matrix[0].length;
        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;
        for(int i =0;i<n;i++){
            low = Math.min(low,matrix[i][0]);
            high = Math.max(high,matrix[i][m-1]);
        }
        int len = (n*m)/2;
        while(low<high){
            int mid = low +(high-low)/2;
            int cnt =0;
            for(int i =0;i<n;i++){
                cnt += helper(matrix[i],mid);
            }
            if(cnt <= len) low = mid+1;
            else high = mid;
        }
        return low;
    }
    public static void main(String[] args) {
        int[][] matrix ={{1,4,9,10},{2,5,6,11},{3,7,8,12}};
        System.out.println(median(matrix));
    }
    
}
