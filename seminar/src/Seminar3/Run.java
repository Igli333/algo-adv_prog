package Seminar3;

public class Run {
    public static void main(String[] args) {
        Integer[] vektor = {4, 8, 5, 9, 6, 3, 2, 7};
        SortingAlgorithms<Integer> ob = new SortingAlgorithms<>();
        ob.insertionSort(vektor);

        for (Integer i : vektor){
            System.out.print(i + " ");
        }
    }
}
