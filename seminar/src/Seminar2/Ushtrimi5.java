package Seminar2;

public class Ushtrimi5 {
    public static void main(String[] args) {
        int shumezim = shumezo(5, 5);

        System.out.println(shumezim);
    }

    private static int shumezo(int m, int n){
        if (n == 0 || m == 0){
            return 0;
        }
        return shumezo(m, n - 1) + m;
    }
}
