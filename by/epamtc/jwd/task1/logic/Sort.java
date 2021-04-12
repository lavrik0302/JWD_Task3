package by.epamtc.jwd.task1.logic;

import by.epamtc.jwd.task1.entity.Array;

public class Sort {
    public static void bubbleSort(Array arr) {
        if (arr != null) {
            // исключение
        }
        int[] array = arr.getValue();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static void insertionSort(Array arr) {
        if (arr != null) {
            // исключение
        }
        int[] array = arr.getValue();
        for (int left = 0; left < array.length; left++) {
            int value = array[left];
            int i = left - 1;
            for (; i >= 0; i--) {
                if (value < array[i]) {
                    array[i + 1] = array[i];
                } else {
                    break;
                }
            }
            array[i + 1] = value;
        }
    }

    public static void selectionSort(Array arr) {
        if (arr != null) {
            // исключение
        }
        int[] array = arr.getValue();
        for (int left = 0; left < array.length; left++) {
            int minInd = left;
            for (int i = left; i < array.length; i++) {
                if (array[i] < array[minInd]) {
                    minInd = i;
                }
            }
            int tmp = array[left];
            array[left] = array[minInd];
            array[minInd] = tmp;
        }
    }
}
