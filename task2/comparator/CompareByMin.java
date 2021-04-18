package by.epamtc.jwd_task3.task2.comparator;

import java.util.Comparator;

public class CompareByMin implements Comparator<int[]> {

    @Override
    public int compare(int[] o1, int[] o2) {
        return minInLine(o1)-minInLine(o2);
    }


    private static int minInLine(int[] array) {
        if (array == null) {
            //throw exception "Array is not initialized"
        }

        int min = array[0];
        for (int i : array) {
            if (i < min) {
                min = i;
            }
        }
        return min;
    }

}
