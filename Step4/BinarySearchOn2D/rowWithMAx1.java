package Step4.BinarySearchOn2D;

import Step4.BinarySearchOn1D.search;

public class rowWithMAx1 {
    public static int rowWithMax1s(int[][] matrix,int n ,int m){
        int cnt =0;
        int idx = -1;
        for(int i =0;i<n;i++){
            int cntOne =0;
            for(int j =0;j<m;j++){
                cntOne += matrix[i][j];
            }
            if(cntOne>cnt){
                cnt = cntOne;
                idx =i;
            }
        }
        return idx;
    }

    //optimal approach
    public static int lowerBound(int[] arr,int n,int x){
        int low =0;
        int high = n-1;
        int ans =n;
        while(low<=high){
            int mid =(low+high)/2;
            if(arr[mid]>=x){
                ans = mid;
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return ans;
    }

    public static int rowWithMax(int[][] matrix,int n ,int m){
        int cnt =0;
        int idx =-1;
        for(int i =0;i<n;i++){
            int cntOne = m -lowerBound(matrix[i], m, 1);
            if(cntOne>cnt){
                cnt = cntOne;
                idx =i;
            }
        }
        return idx;
    }
    public static void main(String[] args) {
        int n =3;
        int m = 3;
        int[][] matrix ={{1,1,1},
                        {0,0,1},
                         {0,0,0}};
        System.out.println(rowWithMax1s(matrix, n, m));
        System.out.println(rowWithMax(matrix, n, m));
    }
}
