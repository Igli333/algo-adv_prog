package Seminar2;

public class Ushtrimi7 {
    public static void main(String[] args) {
        cubes(12);
    }

    private static void cubes(int n) {
        if (n == 0) {
            return;
        }

        cubes(n - 1);

        System.out.print(n * n * n + " ");
    }
}
