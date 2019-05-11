package pl.sda.dublin.sorting;

public class MergeSort {

    private static int[] numbers;
    private static int[] helper;

    public static void mergeSort(int[] numbersToSort) {
        numbers = numbersToSort;
        helper = new int[numbersToSort.length];
        mergesort(0, numbersToSort.length - 1);
    }

    private static void mergesort(int low, int high) {
        if (low < high) {
            int middle = low + (high - low) / 2;
            // posortuj lewa czesc tablicy
            mergesort(low, middle);
            // posortuj prawa czesc tablicy
            mergesort(middle + 1, high);
            // scalaj
            merge(low, middle, high);
        }
    }

    private static void merge(int low, int middle, int high) {
        // przekopiowanie do tablicy pomocniczej
        for (int i = low; i <= high; i++) {
            helper[i] = numbers[i];
        }

        // poczatek lewej tablicy
        int i = low;
        // poczatek prawej tablicy

        int j = middle + 1;

        // indeks aktualnej pozycji
        int k = low;

        while (i <= middle && j <= high) {
            if (helper[i] <= helper[j]) {
                numbers[k] = helper[i];
                i++;
            } else {
                numbers[k] = helper[j];
                j++;
            }
            k++;
        }

        // skopiuj reszte z lewej tablicy
        while (i <= middle) {
            numbers[k] = helper[i];
            i++;
            k++;
        }
    }
}