package Seminar3;

public class SortingAlgorithms<T> {

    public void insertionSort(T[] data) {
        for (int i = 1; i < data.length; i++) {
            Comparable<T> tmp = (Comparable<T>) data[i];

            for (int j = i; j > 0 && tmp.compareTo(data[j - 1]) < 0; j--) {
                data[j] = data[j - 1];
            }

            data[i] = (T) tmp;
        }
    }

    public void bubbleSort(T[] data) {
        for (int i = 0; i < data.length - 1; i++) {
            for (int j = 0; j < data.length - 1; j++) {
                if (((Comparable) data[j]).compareTo(data[j + 1]) < 0) {
                    T temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
            }
        }
    }

    public void selectionSort(T[] data) {
        for (int i = 0; i < data.length - 1; i++) {
            for (int j = i + 1, least = i; j < data.length - 1; j++) {
                if (((Comparable<T>) data[j]).compareTo(data[least]) < 0) {
                    least = j;
                } else if (i != least) {
                    T temp = data[least];
                    data[least] = data[j];
                    data[j] = temp;
                }
            }
        }
    }

    public void shellSort(int[] data) {
        for (int gap = data.length / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < data.length; i++) {
                int key = data[i];
                int j = i;
                while (j >= gap && data[j - gap] > key) {
                    data[j] = data[j - gap];
                    j -= gap;
                }
                data[j] = key;
            }
        }
    }

    public void mergeSort(int[] input) {
        int inputLength = input.length;

        if (inputLength < 2) {
            return;
        }

        int mid = inputLength / 2;
        int[] leftHalf = new int[mid];
        int[] rightHalf = new int[inputLength - mid];

        for (int i = 0; i < mid; i++) {
            leftHalf[i] = input[i];
        }

        for (int i = mid; i < inputLength; i++) {
            rightHalf[i - mid] = input[i];
        }

        mergeSort(leftHalf);
        mergeSort(rightHalf);

        //Merge

        merge(input, leftHalf, rightHalf);

    }

    private void merge(int[] input, int[] leftHalf, int[] rightHalf) {
        int leftSize = leftHalf.length;
        int rightSize = rightHalf.length;

        int i = 0, j = 0, k = 0;

        while (i < leftSize && j < rightSize) {
            if (leftHalf[i] <= rightHalf[j]) {
                input[k] = leftHalf[i];
                i++;
            } else {
                input[k] = rightHalf[j];
                j++;
            }
            k++;
        }

        while (i < leftSize) {
            input[k] = leftHalf[i];
            i++;
            k++;
        }

        while (j < rightSize) {
            input[k] = rightHalf[j];
            j++;
            k++;
        }

    }

    // Sipas zyshes
//    public void mergeSort(int[] arr, int[] aux, int low, int high) {
//        if (high <= low) {
//            return;
//        }
//
//        int mid = (low + high) / 2;
//
//        mergeSort(arr, aux, low, mid);
//        mergeSort(arr, aux, mid + 1, high);
//
//        merge(arr, aux, low, mid, high);
//    }
//
//    private void merge(int[] arr, int[] aux, int low, int mid, int high) {
//        int k = low, i = low, j = mid + 1;
//
//        while (i < mid && j <= high) {
//            if (arr[i] <= arr[j]) {
//                aux[k++] = arr[i++];
//            } else {
//                aux[k++] = arr[j++];
//            }
//        }
//
//        while (i <= mid) {
//            aux[k++] = arr[i++];
//        }
//
//        for (i = low; i <= high; i++){
//            arr[i] = aux[i];
//        }
//    }

    public void quickSort(int[] array, int lowIndex, int highIndex) {

        if (lowIndex >= highIndex){
            return;
        }

        int pivot = array[highIndex];

        int leftPointer = lowIndex, rightPointer = highIndex;

        while (leftPointer < rightPointer) {
            while (array[leftPointer] <= pivot && leftPointer < rightPointer) {
                leftPointer++;
            }

            while (array[rightPointer] >= pivot && leftPointer < rightPointer) {
                rightPointer--;
            }

            swap(array, leftPointer, rightPointer);
        }

        swap(array, leftPointer, highIndex);

        quickSort(array, lowIndex, leftPointer - 1);
        quickSort(array, leftPointer + 1, highIndex);
    }

    private void swap(int[] array, int i1, int i2) {
        int temp = array[i1];
        array[i1] = array[i2];
        array[i2] = temp;
    }
}
