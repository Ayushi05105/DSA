package graph;

public class floydWarshal {

    public static int[][] shortest_Path(int[][] mat){
        int n = mat.length;
        for(int i =0;i<n;i++){
            for(int j =0;j<n;j++){
                if(mat[i][j] == -1){
                    mat[i][j] =(int) 1e9;
                }
                if(i==j) mat[i][j] =0;
            }
        }

        for(int k =0;k<n;k++){
            for(int i =0;i<n;i++){
                for(int j =0;j<n;j++){
                    mat[i][j] = Math.min(mat[i][j],mat[i][k] + mat[k][j]);
                }
            }
        }

        for(int i =0;i<n;i++){
            for(int j =0;j<n;j++){
                if(mat[i][j] ==(int)1e9){
                    mat[i][j] = -1;
                }
            }
        }
        return mat;
    }

    public static void main(String[] args) {
        int[][] mat={{0,2,-1,-1},{1,0,3,-1},{-1,-1,0,-1},{3,5,4,0}};

        int[][] res = shortest_Path(mat);
        for(int i =0;i<mat.length;i++){
            for(int j =0;j<mat.length;j++){
                System.out.print(res[i][j] +" ");
            }
        }
        
    }
    
}
