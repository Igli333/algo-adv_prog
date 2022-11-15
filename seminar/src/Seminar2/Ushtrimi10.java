package Seminar2;

public class Ushtrimi10 {
    public static void main(String[] args) {
        for (int i = 0; i < 20; i++){
            binary(i);
            System.out.print(" ");
            iterativeBinary(i);
            System.out.println();
        }

    }

    private static void binary(int n){
        if (n == 0){
            return;
        }

        binary(n / 2);

        System.out.print(n % 2);
    }

    private static void iterativeBinary(int n){

        String binary = "";
        for (int i = n; i > 0; i /= 2){
            binary = i % 2 + binary;
        }
        System.out.print(binary);
    }
}
