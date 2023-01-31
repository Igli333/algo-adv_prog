package Graph;

import java.util.HashMap;

public class Graph {
    private int numOfNodes;
    private boolean weighted;
    public int[][] matrix;
    public boolean[][] isSetMatrix;

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
}
