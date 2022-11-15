package Seminar2;

public class Ushtrimi6 {
    public static void main(String[] args) {
        int pmpNr = pmp(3,7);

        System.out.println(pmpNr);
    }

    private static int pmp(int n, int m){
        if ((m <= n) && (n % m == 0)){
            return m;
        } else if (n < m) {
            return pmp(m, n);
        } else {
            return pmp(m, n%m);
        }
    }
}
