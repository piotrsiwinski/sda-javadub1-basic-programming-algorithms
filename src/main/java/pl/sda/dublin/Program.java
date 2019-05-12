package pl.sda.dublin;

import pl.sda.dublin.sorting.BubbleSort;
import pl.sda.dublin.sorting.MergeSort;
import pl.sda.dublin.sorting.QuickSort;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        // pobierz od uzytkownika rozmiar tablicy
        Scanner reader = new Scanner(System.in);
        System.out.println("Podaj rozmiar tablicy");
        int size = reader.nextInt();

        // utworz tablice i wypelnij ja liczbami pseudolosowymi
        int[] array = new int[size];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            // do i-tego indeksu wstawiamy losowa liczbe z zakresu < 0; 100)
            // pobierz losowa liczbe
            int randomNumber = random.nextInt(100);
            // wstaw losowa liczbe do tablicy o i-tym indeksie
            array[i] = randomNumber;
        }
        // utworz klase Stopwatch z zadanymi metodami
        int[] kopiaTablicy = Arrays.copyOf(array, array.length);

        Stopwatch watch = new Stopwatch();

        // posortuj tablice sortowaniem babelkowym


        // SORTOWANIE PRZEZ SCALANIE
        watch.start();
        MergeSort.mergeSort(Arrays.copyOf(array, array.length));
        watch.stop();
        System.out.println("Merge sort: " + watch.getElapsedTime() + " ms");


        // SORTOWANIE SZYBKIE
        watch.start();
        QuickSort.sort(Arrays.copyOf(array, array.length));
        watch.stop();
        System.out.println("Sortowanie szybkie: " + watch.getElapsedTime() + " ms");


        // SORTOWANIE BABELKOWE
        watch.start();
        BubbleSort.bubbleSort(kopiaTablicy);
        watch.stop();
        System.out.println("Sortowanie babelkowe: " + watch.getElapsedTime() + " ms");


    }
}
