package Graphs;

import java.util.PriorityQueue;
import java.util.Set;

public class Graph {
    private int numOfNodes;
    private boolean directed;
    private boolean weighted;
    private int[][] matrix;
    private boolean[][] isSetMatrix;

    public Graph(int numOfNodes, boolean directed, boolean weighted) {
        this.directed = directed;
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

        if (!directed) {
            matrix[destination][source] = value;
            isSetMatrix[destination][source] = true;
        }
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

    public void dijkstra() {
        boolean[] visited = new boolean[numOfNodes];
        int[] distance = new int[numOfNodes];

        for (int i = 0; i < numOfNodes; i++) {
            distance[i] = Integer.MAX_VALUE;
        }

        distance[0] = 0;

        for (int i = 0; i < numOfNodes; i++) {
            int a = minimalDistance(distance, visited);

            if (a < 0){
                continue;
            }
            visited[a] = true;

            for (int j = 0; j < numOfNodes; j++){
                if (!visited[j] && matrix[a][j] != 0 && (distance[a] + matrix[a][j] <distance[j])){
                    distance[j] = distance[a] + matrix[a][j];
                }
            }
        }

        for (int i = 0; i < distance.length; i++){
            if (distance[i] != Integer.MAX_VALUE){
                System.out.println("Distance from "+ 0 + " to " + i + " is " + distance[i]);
            }
        }
    }

    private int minimalDistance(int[] distance, boolean[] visited) {
        int minDistance = Integer.MAX_VALUE;
        int minDistanceNode = -1;

        for (int i = 0; i < distance.length; i++) {
            if (!visited[i] && distance[i] < minDistance){
                minDistance = distance[i];
                minDistanceNode = i;
            }
        }

        return minDistanceNode;
    }

    public void bellmanFord() {

    }

}
