package step15;
import java.util.*;

public class GraphRepresentation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input: number of nodes and edges
        int n = sc.nextInt(); // nodes
        int m = sc.nextInt(); // edges

        // Step 1: Create matrix
        int[][] adj = new int[n + 1][n + 1];

        // Step 2: Take edges input
        for(int i = 0; i < m; i++){
            int u = sc.nextInt();
            int v = sc.nextInt();

            // Undirected graph
            adj[u][v] = 1;
            adj[v][u] = 1;
        }

        // Step 3: Print matrix
        System.out.println("Adjacency Matrix:");
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                System.out.print(adj[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}