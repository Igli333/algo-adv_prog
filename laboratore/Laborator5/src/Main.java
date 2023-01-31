import Graph.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        char[] cities = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J'};
        Graph country = new Graph(10, true);
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (i == j || country.isSetMatrix[j][i]){
                    continue;
                }
                System.out.print("Distance from " + cities[i] + " to " + cities[j] + ": ");
                int rruga = sc.nextInt();
                if (rruga != -1) {
                    country.addEdge(i, j, rruga);
                } else {
                    country.addEdge(i, j, Integer.MAX_VALUE);
                }
            }
        }

        ShortestPath shortestPath = new ShortestPath(country);

        shortestPath.shortestPath();
        shortestPath.printBestPath();
    }


}