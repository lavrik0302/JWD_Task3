package by.epamtc.jwd_task3.task2.logic;

import java.util.Comparator;

public class Sort {

    public static void bubbleSort(int[][] array, Comparator<int[]> sortType) {
        if (array == null) {
            //throw exception
        }

        for (int i = array.length - 1; i < array.length; i--) {
            for (int j = 0; j < i; j++) {
                if (sortType.compare(array[j], array[j + 1]) > 0) {
                    int temp[] = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static void reverse(int[][] array) {
        int i = 0;
        int j = array.length - 1;
        while (i <= j) {
            int temp[] = array[i];
            array[i] = array[j];
            array[j] = temp;
            i++;
            j--;
        }
    }
}
