import Graph.Graph;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        char[] cities = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J'};
        Graph country = new Graph(10, true);
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.println("Distance from city" + (cities[i] + 1) + " to city" + (cities[j] + 1) + ": ");
                int rruga = sc.nextInt();
                if (rruga != -1) {
                    country.addEdge(i, j, rruga);
                }
            }
        }

        country.findTrip();
    }


}