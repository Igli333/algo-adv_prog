public class Main {
    public static void main(String[] args) {
        BinarySearch binarySearch = new BinarySearch();
        int[] array1 = {1, 2, 2, 3, 4, 4, 4, 4, 6, 6, 6, 6, 6, 6, 7};
        int[] array2 = {1, 1, 2, 3, 4, 5, 6, 6, 6, 7, 7, 7, 7, 8, 10, 10};

        System.out.println("Per vektorin 1: ");

        for (int i = 1; i < 8; i++) {
            System.out.println("Indeksi i pare i " + i + ": " + binarySearch.firstIndexSearch(array1, i));
            System.out.println("Indeksi i fundit i " + i + ": " + binarySearch.lastIndexSearch(array1, i));
            System.out.println();
        }

        System.out.println("Elementi me i perseritur " + binarySearch.findMostRepeatedValue(array1));

        System.out.println("\n\n");

        System.out.println("Per vektorin 2: ");

        for (int i = 1; i < 11; i++) {
            System.out.println("Indeksi i pare i " + i + ": " + binarySearch.firstIndexSearch(array2, i));
            System.out.println("Indeksi i fundit i " + i + ": " + binarySearch.lastIndexSearch(array2, i));
            System.out.println();
        }

        System.out.println("Elementi me i perseritur " + binarySearch.findMostRepeatedValue(array2));


    }
}