package Seminar2;

public class Ushtrimi3 {
    public static void main(String[] args) {
        int n = 12;

        printTekRrites(n);
        System.out.println();
        printTekZbrites(n);
    }

    private static void printTekRrites(int n) {
        if (n == 0) {
            return;
        }

        if (n % 2 == 0) {
            printTekRrites(n - 1);
        } else {
            printTekRrites(n - 2);
            System.out.print(n + " ");
        }
    }

    private static void printTekZbrites(int n) {
        if (n == 0) {
            return;
        }

        if (n % 2 != 0) {
            System.out.print(n + " ");
            printTekZbrites(n - 2);
        } else {
            printTekZbrites(n - 1);
        }
    }
}
