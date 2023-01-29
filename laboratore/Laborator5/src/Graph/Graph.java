package Graph;

import java.util.HashMap;

public class Graph {
    private int numOfNodes;
    private boolean weighted;
    private int[][] matrix;
    private boolean[][] isSetMatrix;

    private char[] cities = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J'};

    public Graph(int numOfNodes, boolean weighted) {
        this.weighted = weighted;
        this.numOfNodes = numOfNodes;

        matrix = new int[numOfNodes][numOfNodes];
        isSetMatrix = new boolean[numOfNodes][numOfNodes];
    }

    public void addEdge(int source, int destination, int weight) {
        int value = 1;

        if (weighted) {
            value = weight;
        }

        matrix[source][destination] = value;
        isSetMatrix[source][destination] = true;

        matrix[destination][source] = value;
        isSetMatrix[destination][source] = true;
    }

    public void printEdges() {
        for (int i = 0; i < numOfNodes; i++) {
            System.out.print("Node " + i + "is connected to : ");
            for (int j = 0; j < numOfNodes; j++) {
                if (isSetMatrix[i][j]) {
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }
    }

    public void findTrip() {
        boolean[] visited = new boolean[numOfNodes];
        visited[0] = true;

        HashMap<Integer, String> rruget = new HashMap<>();

        int cycle = findShortestTrip(visited, 0, 1, 0, 0, rruget);

        System.out.println(cycle);

    }

    private int findShortestTrip(boolean[] visited, int position, int count, int cost, int cycle, HashMap<Integer, String> rruget) {

        if (count == numOfNodes && matrix[position][0] > 0) {
            return Math.min(cycle, cost + matrix[position][0]);
        }

        String rruga = "";
        for (int i = 0; i < numOfNodes; i++){
            if (!visited[i] && matrix[position][i] > 0){
                visited[i] = true;

                cycle = findShortestTrip(visited, i, count + 1,cost + matrix[position][i], cycle, rruget);

                visited[i] = false;
                rruga += cities[i];
            }



        }

        return cycle;
    }

}
