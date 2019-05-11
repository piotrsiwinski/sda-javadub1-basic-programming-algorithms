package pl.sda.dublin.sorting;

public class InsertionSort {
    public static int[] insertionSort(int[] tab, int n) {

        for (int i = 1; i < n; i++) {

            int j = i;
            while (j > 0 && tab[j - 1] > tab[j]) {
                int value;
                value = tab[j];
                tab[j] = tab[j - 1];
                tab[j - 1] = value;
                j--;
            }
        }
        return tab;
    }

}
