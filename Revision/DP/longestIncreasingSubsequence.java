package Revision.DP;
import java.util.*;
public class longestIncreasingSubsequence {

    // by recursion

    public static int helper(int[] arr,int n,int idx,int prev_Idx){
        if(idx ==n) return 0;

        int len = helper(arr,n,idx+1,prev_Idx);
        
        if(prev_Idx ==-1 || arr[idx] > arr[prev_Idx]){
            len = Math.max(len,1 + helper(arr,n,idx+1,idx));
        }
        return len;
    }

    public static int subsequence2(int[] arr){
        int n = arr.length;
        return helper(arr,n,0,-1);
    }

    // by memoization

    public static int helper3(int[] arr,int n,int idx,int prev_Idx,int[][] dp){
        if(idx == n) return 0;
        if(dp[idx][prev_Idx+1] != -1){
            return dp[idx][prev_Idx+1];
        }
        int len = helper3(arr,n,idx+1,prev_Idx,dp);
        if(prev_Idx == -1 || arr[idx]>arr[prev_Idx]){
            len = Math.max(len,1+ helper3(arr, n, idx+1, idx,dp));
        }
        return dp[idx][prev_Idx+1] = len;
    }

   public static void subsequence3(int[] arr){
    int n = arr.length;
    int[][] dp = new int[n][n+1];
    for(int[] row:dp){
        Arrays.fill(row,-1);
    }
    helper3(arr, n, 0, -1, dp);

    int idx =0;
    int prev_Idx = -1;
    while(idx <n){
        if(prev_Idx==-1 || arr[idx]>arr[prev_Idx]){
            int take =1;
            if(idx +1<n){
                take += helper3(arr, n, idx+1, idx,dp);
            }
            int notTake = helper3(arr, n, idx+1, prev_Idx, dp);
            if(take>= notTake){
            System.out.print(arr[idx]+" ");
            prev_Idx = idx;
        }
        }
        idx++;  
    }
   }

   // by tabulation
   public static int subsequence4(int[] arr){
    int n = arr.length;
    int[][] dp = new int[n+1][n+1];
    for(int i =n-1;i>=0;i--){
        for(int j =0;j<=n;j++){
            int len = dp[i+1][j];
            if(j== 0 || arr[i]>arr[j-1]){
                len = Math.max(len,1 + dp[i+1][i+1]);
            }
            dp[i][j] = len;
        }
    }
    return dp[0][0];
   }

    // by binary search

    public static int subsequence(int[] arr){
        int n = arr.length;
        ArrayList<Integer> temp = new ArrayList<>();
        temp.add(arr[0]);
        for(int i =1;i<n;i++){
            if(arr[i] > temp.get(temp.size()-1)){
                temp.add(arr[i]);
            }
            else{
                int low = 0;
                int high = temp.size()-1;
                while(low<high){
                    int mid =(low+high)/2;
                    if(temp.get(mid) >=arr[i]){
                        high = mid;
                    }
                    else{
                        low = mid+1;
                    }
                }
                temp.set(low,arr[i]);
                
            }
        }
        return temp.size();
    }
    public static void main(String[] args) {
        int[] arr={10,9,2,5,3,7,101,18};
        System.out.println(subsequence(arr));
        System.out.println(subsequence2(arr));
        //System.out.println(subsequence3(arr));
        System.out.println(subsequence4(arr));
        subsequence3(arr);
        
    }
    
}
