package by.epamtc.jwd.task1;

import by.epamtc.jwd.task1.entity.Array;
import by.epamtc.jwd.task1.logic.FindNumbers;
import by.epamtc.jwd.task1.logic.Search;
import by.epamtc.jwd.task1.logic.Sort;

import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 5, 8, 13, 21, 34, 54, 54, 144, 233, 377, 610, 987, 1597, 0, 0, 0, 2584, 4181, 6765, 17711};
        Array b = new Array(a);

        System.out.println("Array:");
        System.out.println(b);
        System.out.println();

        Sort.bubbleSort(b);
        System.out.println("Sorted array:");
        System.out.println(b);
        System.out.println();

        int pos = Search.binarySearch(b, 13);
        System.out.println("index of 13 = " + pos);
        System.out.println();

        int max = Search.max(b);
        System.out.println("max value = " + max);
        System.out.println();

        int min = Search.min(b);
        System.out.println("min value = " + min);
        System.out.println();

        System.out.println("Prime numbers:");
        System.out.println(Arrays.toString(FindNumbers.findPrimeNumbers(b)));
        System.out.println();

        System.out.println("Fibonachi numbers:");
        System.out.println(Arrays.toString(FindNumbers.findFibonachiNumbers(b)));
        System.out.println();

        System.out.println("Three-digit numbers without the same characters:");
        System.out.println(Arrays.toString(FindNumbers.findUniqueNumbers(b)));
    }
}
