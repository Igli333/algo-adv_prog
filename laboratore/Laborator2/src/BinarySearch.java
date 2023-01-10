public class BinarySearch {
    public int firstIndexSearch(int[] array, int element) {
        return firstIndexBinarySearch(array, element, 0, array.length - 1);
    }

    private int firstIndexBinarySearch(int[] array, int element, int start, int end) {
        if (end < start) {
            return -1;
        }

        int middle = (end + start) / 2;

        if (array[middle] == element) {
            if(((middle - 1) > -1 && array[middle - 1] != element) || middle == 0){
                return middle;
            }
        } else if (array[middle] < element) {
            return firstIndexBinarySearch(array, element, middle + 1, end);
        }
        return firstIndexBinarySearch(array, element, 0, middle - 1);
    }

    public int lastIndexSearch(int[] array, int element) {
        return lastIndexBinarySearch(array, element, 0, array.length - 1);
    }

    private int lastIndexBinarySearch(int[] array, int element, int start, int end) {
        if (end < start) {
            return -1;
        }

        int middle = (end + start) / 2;

        if (array[middle] == element) {
            if(((middle + 1) < array.length && array[middle + 1] != element) || middle == array.length - 1){
                return middle;
            }
        } else if (array[middle] > element) {
            return lastIndexBinarySearch(array, element, 0, middle - 1);
        }
        return lastIndexBinarySearch(array, element, middle + 1, end);
    }

}
