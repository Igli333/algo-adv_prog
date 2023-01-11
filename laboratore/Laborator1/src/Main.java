import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner s1 = new Scanner(new File("rand100.txt"));
        Scanner s2 = new Scanner(new File("rand500.txt"));
        Scanner s3 = new Scanner(new File("rand1000.txt"));
        Scanner s4 = new Scanner(new File("rand5000.txt"));
        Scanner s5 = new Scanner(new File("rand10000.txt"));

        ArrayList<Integer> l1 = readFiles(s1);
        ArrayList<Integer> l2 = readFiles(s2);
        ArrayList<Integer> l3 = readFiles(s3);
        ArrayList<Integer> l4 = readFiles(s4);
        ArrayList<Integer> l5 = readFiles(s5);


        System.out.println("Merge sort ne nje vektor me 100 numra");
        System.out.println("Koha e ekzekutimit: " + mergeSortTime(l1));
        System.out.println();

        System.out.println("Merge sort ne nje vektor me 500 numra");
        System.out.println("Koha e ekzekutimit: " + mergeSortTime(l2));
        System.out.println();

        System.out.println("Merge sort ne nje vektor me 1000 numra");
        System.out.println("Koha e ekzekutimit: " + mergeSortTime(l3));
        System.out.println();

        System.out.println("Merge sort ne nje vektor me 5000 numra");
        System.out.println("Koha e ekzekutimit: " + mergeSortTime(l4));
        System.out.println();

        System.out.println("Merge sort ne nje vektor me 10000 numra");
        System.out.println("Koha e ekzekutimit: " + mergeSortTime(l5));
        System.out.println();

        System.out.println("Quick sort ne nje vektor me 100 numra");
        System.out.println("Koha e ekzekutimit: " + quickSortTime(l1));
        System.out.println();

        System.out.println("Quick sort ne nje vektor me 500 numra");
        System.out.println("Koha e ekzekutimit: " + quickSortTime(l2));
        System.out.println();

        System.out.println("Quick sort ne nje vektor me 1000 numra");
        System.out.println("Koha e ekzekutimit: " + quickSortTime(l3));
        System.out.println();

        System.out.println("Quick sort ne nje vektor me 5000 numra");
        System.out.println("Koha e ekzekutimit: " + quickSortTime(l4));
        System.out.println();

        System.out.println("Quick sort ne nje vektor me 10000 numra");
        System.out.println("Koha e ekzekutimit: " + quickSortTime(l5));
        System.out.println();

    }

    private static ArrayList<Integer> readFiles(Scanner scanner) {
        ArrayList<Integer> list = new ArrayList<>();
        while (scanner.hasNext()) {
            list.add(scanner.nextInt());
        }

        return list;
    }

    private static long mergeSortTime(ArrayList<Integer> list) {
        long start = System.currentTimeMillis();

        Sort.mergeSort(list);

        long end = System.currentTimeMillis();

        return end - start;
    }

    private static long quickSortTime(ArrayList<Integer> list) {
        long start = System.currentTimeMillis();

        Sort.quickSort(list);

        long end = System.currentTimeMillis();

        return end - start;
    }

}
