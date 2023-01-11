import java.util.ArrayList;

public class Sort {
    public static void mergeSort(ArrayList<Integer> list) {
        mergeSort(list, 0, list.size() - 1);
    }

    private static void mergeSort(ArrayList<Integer> list, int start, int end) {
        if (start >= end) {
            return;
        }

        int mid = (start + end) / 2;
        mergeSort(list, start, mid);
        mergeSort(list, mid + 1, end);

        merge(list, start, mid, end);
    }

    private static void merge(ArrayList<Integer> list, int start, int mid, int end) {
        ArrayList<Integer> helper = new ArrayList<>();

        int i = start;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= end) {
            if (list.get(i) < list.get(j)) {
                helper.add(list.get(i));
                i++;
            } else {
                helper.add(list.get(j));
                j++;
            }
        }

        while (i <= mid) {
            helper.add(list.get(i));
            i++;
        }

        while (j <= end) {
            helper.add(list.get(j));
            j++;
        }

        for (i = start; i <= end; i++) {
            list.set(i, helper.get(k++));
        }
    }


    public static void quickSort(ArrayList<Integer> list) {
        quickSort(list, 0, list.size() - 1);
    }

    private static void quickSort(ArrayList<Integer> list, int start, int end) {
        if ((end - 1) - start < 1) {
            return;
        }

        int i = start;
        int j = end - 1;

        while (i <= j) {
            if (list.get(i) > list.get(end)) {
                if (list.get(j) < list.get(end)) {
                    swap(list, i, j);
                    i++;
                    continue;
                }
                j--;
                continue;
            }
            i++;
        }

        swap(list, i, end);


        quickSort(list, start, i - 1);
        quickSort(list, i + 1, end);
    }


    private static void swap(ArrayList<Integer> list, int start, int end) {
        int temp = list.get(start);
        list.set(start, list.get(end));
        list.set(end, temp);
    }
}
