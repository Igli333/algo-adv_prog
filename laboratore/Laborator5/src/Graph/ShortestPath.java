package Graph;

import java.util.Arrays;

public class ShortestPath {
    private char[] cities;
    private Graph graph;
    private boolean[] visited;
    private int[] currentPath;
    private int[] bestPath;
    private int bestPathCost;

    public ShortestPath(Graph graph) {
        cities = new char[]{'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J'};
        this.graph = graph;
        visited = new boolean[cities.length];
        currentPath = new int[cities.length];
    }

    public int shortestPath() {
        Arrays.fill(visited, false);
        visited[0] = true;
        currentPath[0] = 0;
        bestPathCost = Integer.MAX_VALUE;
        shortestPathProgram(0, 1, 0);
        return bestPathCost;
    }

    private int shortestPathProgram(int currentCity, int cityCounter, int totalCost) {
        if (cityCounter >= visited.length) {
            int distanceToStart = graph.matrix[currentCity][0];
            if (distanceToStart > 0) {
                return totalCost + distanceToStart;
            }
        }

        int localResult = Integer.MAX_VALUE;
        for (int i = 0; i < visited.length; i++) {
            if (!visited[i] && currentCity != i) {
                visited[i] = true;
                currentPath[cityCounter] = i;
                localResult =
                        shortestPathProgram(i, cityCounter + 1, totalCost + graph.matrix[currentCity][i]);
                visited[i] = false;
                if (localResult < bestPathCost) {
                    bestPathCost = localResult;
                    bestPath = Arrays.copyOf(currentPath, currentPath.length);
                }
            }

        }
        return localResult;
    }

    public void printBestPath() {
        System.out.print("Best path: ");
        for (int i : bestPath) {
            System.out.print(cities[i] + "->");
        }
        System.out.println(cities[0]);
    }

}
