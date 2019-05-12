package pl.sda.dublin.sorting;

public class QuickSort {

    // 1 - static
    private static int[] numbers;

    // 2 - static
    public static void sort(int[] values) {
        // sprawdzenie czy tablica ma wartosci
        if (values == null || values.length == 0) {
            System.out.println("pusta tablica");
            return;
        }
        // 3 - bez this
        numbers = values;
        quicksort(0, numbers.length - 1);
    }

    // 4 - static
    private static void quicksort(int low, int high) {
        // tworzymy zmienne pomocnicze, tak by zapamietac gdzie rozpoczelismy przechodzenie po tablicach
        int i = low;
        int j = high;

        // wybierz pivot i midIndex
        int midIndex = (low + high) / 2;
        int pivot = numbers[midIndex];

        // wykonuj tak długo, az indexy i oraz j sie spotkają
        while (i <= j) {
            // szukamy elementu wiekszego od pivota z lewej tablicy (wskaźnik i)
            while (numbers[i] < pivot) {
                i++;
            }
            // szukamy elementu mniejszego od pivota w prawej tablicy
            // wykonuj tak dlugo az znajdziesz element mniejszy od pivota w prawej tablicy
            while (numbers[j] > pivot) {
                j--;
            }
            if (i <= j) {
                // zamien miejscami i oraz j
                int helper = numbers[i];
                numbers[i] = numbers[j];
                numbers[j] = helper;
                i++;
                j--;
            }
        }

        // warunek zakończenia rekurencji
        // jezeli zostało cos do sortowania
        if (low < j) {
            quicksort(low, j);
        }
        if (i < high) {
            quicksort(i, high);
        }


    }
}
