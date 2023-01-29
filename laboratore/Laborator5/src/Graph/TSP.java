import java.util.Scanner;

public class TSP {
    static int INF = Integer.MAX_VALUE;
    static int V;
    static int[][] graph;
    static boolean[] visited;
    static int[] path;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get number of cities
        System.out.print("Enter number of cities: ");
        V = sc.nextInt();

        // Initialize graph and visited array
        graph = new int[V][V];
        visited = new boolean[V];
        path = new int[V];

        // Get connections between cities
        for (int i = 0; i < V; i++) {
            for (int j = i; j < V; j++) {
                if (i != j) {
                    System.out.print("Enter distance between city " + (i + 1) + " and city " + (j + 1) + " (or -1 if no connection): ");
                    int distance = sc.nextInt();
                    if(distance == -1)
                        graph[i][j] = INF;
                    else
                        graph[i][j] = distance;
                    graph[j][i] = distance;
                }
            }
        }

        // Solve TSP
        int start = 0;
        int dist = tsp(start);

        // Print path
        System.out.print("\nPath: ");
        for (int i = 0; i < V; i++) {
            System.out.print((path[i] + 1) + " -> ");
        }
        System.out.print("1");
        System.out.print("\nMinimum distance: " + dist);
    }

    static int tsp(int start) {
        int minDist = INF;
        path[0] = start;
        visited[start] = true;

        for (int i = 0; i < V - 1; i++) {
            int v = path[i];
            for (int j = 0; j < V; j++) {
                if (!visited[j]) {
                    path[i + 1] = j;
                    visited[j] = true;
                    int dist = graph[v][j] + tsp(j);
                    if (dist < minDist) {
                        minDist = dist;
                    }
                    visited[j] = false;
                }
            }
        }
        return minDist;
    }
}
