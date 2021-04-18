package by.epamtc.jwd_task3.task2.logic;

import by.epamtc.jwd_task3.task2.comparator.CompareByMax;
import by.epamtc.jwd_task3.task2.comparator.CompareByMin;
import by.epamtc.jwd_task3.task2.comparator.CompareBySum;

public class Main {
    public static void main(String[] args) {
        int[][] array = {{5, 4, 3}, {6, 10, 4}, {2, 0, 7}, {1, 4, 88}};
        for (int[] i : array) {
            for (int j : i) {
                System.out.print(j + "  ");
            }
            System.out.println();
        }
        System.out.println("------");

        Sort.bubbleSort(array, new CompareBySum());

        for (int[] i : array) {
            for (int j : i) {
                System.out.print(j + "  ");
            }
            System.out.println();
        }
    }
}
