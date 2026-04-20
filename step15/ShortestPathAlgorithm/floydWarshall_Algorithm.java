package step15.ShortestPathAlgorithm;

public class floydWarshall_Algorithm {

    public static int[][] floyd_Warshall(int[][] arr){
        int n = arr.length;

        for(int i =0;i<n;i++){
            for(int j =0;j<n;j++){
                if(arr[i][j]==-1) arr[i][j] = (int)1e9;
                if(i == j) arr[i][j] =0;
            }
        }
        for(int k =0;k<n;k++){
            for(int i =0;i<n;i++){
                for(int j =0;j<n;j++){
                    arr[i][j] = Math.min(arr[i][j],arr[i][k] + arr[k][j]);
                }
            }
        }
        for(int i =0;i<n;i++){
            for(int j =0;j<n;j++){
                if(arr[i][j] == (int)1e9){
                    arr[i][j] = -1;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[][] arr={{0,2,-1,-1},{1,0,3,-1},{-1,-1,0,-1},{3,5,4,0}};
        int[][] matrix = floyd_Warshall(arr);
        for(int i =0;i<matrix.length;i++){
            for(int j =0;j<matrix.length;j++){
                System.out.print(matrix[i][j] +" ");
            }
        }
    }
    
}
