package pl.sda.dublin.sorting;

public class BubbleSort {

    public static int[] bubbleSort(int[] tabDoPosortowania) {
        for (int j = 0; j < tabDoPosortowania.length; j++) {
            for (int i = 0; i < tabDoPosortowania.length - 1; i++) {
                if (tabDoPosortowania[i] > tabDoPosortowania[i + 1]) {
                    int x = tabDoPosortowania[i];
                    tabDoPosortowania[i] = tabDoPosortowania[i + 1];
                    tabDoPosortowania[i + 1] = x;
                }

            }
        }
        return tabDoPosortowania;
    }
}
