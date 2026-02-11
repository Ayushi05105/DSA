package Step2.Array.medium;

public class rotateMatrix {
    public static int[][] rotate(int[][] matrix) {
        int n = matrix.length;
        int[][] rotated = new int[n][n];
        for(int i =0;i<n;i++){
            for(int j =0;j<n;j++){
                rotated[j][n-i-1] = matrix[i][j];
            }
        }
        return rotated;
    }

    public static void rotate1(int[][] matrix) {
        int n = matrix.length;
        for(int i=0;i<n;i++){
            for(int j =i+1;j<n;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for(int i =0;i<n;i++){
            int left =0,right = n-1;
            while(left < right){
                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;
                left++;
                right--;
            }
            
        }
    }
    public static void main(String[] args) {
        int[][] matrix ={{0,1,1,2},{2,0,3,1},{4,5,0,5},{5,6,7,0}};
        System.out.println(rotate(matrix));

    }
    
}
