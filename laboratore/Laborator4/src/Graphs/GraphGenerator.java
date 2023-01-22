package Graphs;

import java.util.Random;

public class GraphGenerator {

    public Graph generateDirectedGraph(int size) {
        Graph graph = new Graph(size, true, true);

        Random r = new Random();
        int i = 0, j = 0;

        while (i < size) {
            while (j < size){
                graph.addEdge(i, j, r.nextInt(10));
                j++;
            }
            i++;
        }

        return graph;
    }

    public Graph generateUndirectedGraph(int size) {
        Graph graph = new Graph(size, false, true);

        Random r = new Random();
        int i = 0, j = 0;

        while (i < size) {
            while (j < size/2){
                graph.addEdge(i, j, r.nextInt(20));
                j++;
            }
            i++;
        }

        return graph;
    }


}
