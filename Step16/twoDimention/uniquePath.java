package Step16.twoDimention;
public class uniquePath {
    public static int helper(int i,int j){
        if(i==0 && j==0) return 1;
        if(i<0 || j<0) return 0;
        int up = helper(i-1, j);
        int left = helper(i, j-1);
        return up + left;
    }
    public static int unique(int m ,int n){
        return helper(m-1, n-1);
    }

    public static int tabulation(int m , int n){
        int[][] dp = new int[m][n];
        for(int i =0;i<m;i++){
            for(int j =0;j<n;j++){
                if(i==0 && j==0){
                    dp[i][j]=1;
                }
                else{
                    int up =0;
                    int left =0;
                    if(i>0) up = dp[i-1][j];
                    if(j>0) left = dp[i][j-1];
                    dp[i][j] = left + up;
                }
            }
        }
        return dp[m-1][n-1];
        
    }
    public static void main(String[] args) {
        int m =3;
        int n =7;
        System.out.println(unique(m, n));
        System.out.println(tabulation(m, n));
    }
    
}
