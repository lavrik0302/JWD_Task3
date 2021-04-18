package by.epamtc.jwd_task3.task2.comparator;

import java.util.Comparator;

public class CompareBySum implements Comparator<int[]> {
    @Override
    public int compare(int[] o1, int[] o2) {
        return sumInLine(o1) - sumInLine(o2);
    }

    private static int sumInLine(int[] array) {
        if (array == null) {
            //throw exception "Array is not initialized"
        }

        int sum = 0;
        for (int i : array) {
            sum += i;
        }

        return sum;
    }

}
