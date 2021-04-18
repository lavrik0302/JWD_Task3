package by.epamtc.jwd_task3.task2.comparator;

import java.util.Comparator;

public class CompareByMax implements Comparator<int[]> {
    @Override
    public int compare(int[] o1, int[] o2) {
        return maxInLine(o1) - maxInLine(o2);
    }

    private static int maxInLine(int[] array){
        if (array == null) {
            //throw exception "Array is not initialized"
        }

        int max = array[0];
        for (int i : array) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }
}
