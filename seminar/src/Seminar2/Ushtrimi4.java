package Seminar2;

public class Ushtrimi4 {

    public static void main(String[] args) {
        int n = 27;

        sirakuza(n);

    }

    private static void sirakuza(int n) {
        if (n == 1) {
            System.out.print(n);
            return;
        }

        System.out.print(n + " ");

        if (n % 2 == 0) {
            sirakuza(n / 2);
        } else {
            sirakuza(3 * n + 1);
        }


    }
}
