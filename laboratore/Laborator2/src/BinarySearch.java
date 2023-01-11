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
            if (middle == 0 || (array[middle - 1] != element)) {
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
            if ((middle == array.length - 1) || (array[middle + 1] != element)) {
                return middle;
            }
        } else if (array[middle] > element) {
            return lastIndexBinarySearch(array, element, 0, middle - 1);
        }
        return lastIndexBinarySearch(array, element, middle + 1, end);
    }

    public int findMostRepeatedValue(int[] array) {
        int[] indexes = new int[array[array.length - 1] + 1];

        for (int i = 0; i < array.length; i++) {
            indexes[array[i]]++;
        }

        int max = 0;
        int count = 0;
        for (int j = 0; j < indexes.length; j++) {
            if (count < indexes[j]) {
                max = j;
                count = indexes[j];
            }
        }
        return max;
    }

}
