public class Main {
    public static void main(String[] args) {
        BinarySearch binarySearch = new BinarySearch();
        int[] array1 = {1,2,2,3,4,4,4,4,6,6,6,6,6,6,7};
        int[] array2 = {1,1,2,3,4,5,6,6,6,7,7,7,8,10,10};

        System.out.println("Per vektorin 1: ");

        System.out.println("Indeksi i pare i 4: " + binarySearch.firstIndexSearch(array1, 1));
        System.out.println("Indeksi i fundit i 4: " + binarySearch.lastIndexSearch(array1, 1));
    }
}