import Graphs.Graph;
import Graphs.GraphGenerator;

public class Main {

    private static final GraphGenerator graphGenerator = new GraphGenerator();

    public static void main(String[] args) {
        Graph[] testGraphs = new Graph[10];
        generateGraphs(testGraphs);

        execute(testGraphs);
    }

    private static void generateGraphs(Graph[] testGraphs) {
        for (int i = 0; i < 10; i++) {
            if ((i + 1) % 2 != 0) {
                testGraphs[i] = graphGenerator.generateDirectedGraph((i + 1) * 100);
            } else {
                testGraphs[i] = graphGenerator.generateUndirectedGraph((i + 1) * 100);
            }
        }
    }

    private static long executeDijkstra(Graph graph) {
        long start = System.currentTimeMillis();
        graph.dijkstra();
        long end = System.currentTimeMillis();
        return end - start;
    }

    private static long executeBellmanFord(Graph graph) {
        long start = System.currentTimeMillis();
        graph.bellmanFord();
        long end = System.currentTimeMillis();
        return end - start;
    }

    private static void execute(Graph[] graphs) {
        for (int i = 0; i < graphs.length; i++) {
            System.out.println("Per graph " + (i + 1));
            System.out.println("Dijkstra");
            long dijkstra = executeDijkstra(graphs[i]);
            System.out.println("\nBellman-Ford");
            long bellmanFord = executeBellmanFord(graphs[i]);
            System.out.println("Dijkstra: \n" + dijkstra + "\n");
            System.out.println("Bellman-Ford: \n" + bellmanFord + "\n");
            System.out.println("\n");
        }
    }
}