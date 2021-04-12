package by.epamtc.jwd.task1.logic;

import by.epamtc.jwd.task1.entity.Array;

public class Search {
    public static int binarySearch(Array arr, int value) {
        if (arr != null) {
            // исключение
        }
        int[] array = arr.getValue();
        int start = 0;
        int end = array.length;
        int middle = 0;
        while (array[middle] != value) {
            middle = (end + start) / 2;
            if (array[middle] > value) {
                end = middle;
            } else if (array[middle] < value) {
                start = middle;
            } else if (array[middle] == value) {
                break;
            }
        }
        return middle;
    }

    public static int max(Array array) {
        if (array != null) {
            // исключение
        }
        int[] arr = array.getValue();
        int max = arr[0];
        for (int j : arr) {
            if (max < j)
                max = j;
        }
        return max;
    }

    public static int min(Array array) {
        if (array != null) {
            // исключение
        }
        int[] arr = array.getValue();
        int min = arr[0];
        for (int j : arr) {
            if (min > j)
                min = j;
        }
        return min;
    }
}