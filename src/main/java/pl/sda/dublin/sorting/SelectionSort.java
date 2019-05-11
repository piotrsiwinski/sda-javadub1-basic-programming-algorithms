package pl.sda.dublin.sorting;

public class SelectionSort {
    public static int[] selectionSort(int[] tab, int n) {

        for (int i = n; i > 0; i--) {
            int minimum = tab[0];
            for (int j = 1; j < n - 1; j++) {
                int currentMinimum = 0;
                if (tab[j] < minimum) {
                    currentMinimum = minimum;
                }
                int temp = minimum;
                minimum = currentMinimum;
                currentMinimum = temp;
            }
        }
        return tab;
    }
}
