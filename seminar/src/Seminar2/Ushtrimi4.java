package Seminar2;

public class Ushtrimi4 {

    public static void main(String[] args) {
        int n = 27;

        sirakuza(n);

    }

    private static void sirakuza(int n) {
        if (n == 1){
            return;
        }

        int newN = 0;

        if (n % 2 == 0){
            newN = n/2;
        } else {
           newN = 3*n + 1;
        }

        System.out.print(newN + " ");

        sirakuza(newN);
    }
}
