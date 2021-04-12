package by.epamtc.jwd.task1.logic;

import by.epamtc.jwd.task1.entity.Array;

import java.util.Arrays;

public class FindNumbers {
    public static int[] findPrimeNumbers(Array arr) {
        if (arr != null) {
            // исключение
        }
        int[] array = arr.getValue();
        int[] primeNumbers = new int[array.length];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (isPrimeNumber(array[i])) {
                primeNumbers[index] = array[i];
                index++;
            }
        }
        return Arrays.copyOf(primeNumbers, index);
    }

    private static boolean isPrimeNumber(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0)
                return false;
        }
        return true;
    }

    public static int[] findUniqueNumbers(Array arr) {
        if (arr != null) {
            // исключение
        }
        int[] array = arr.getValue();
        int[] uniqueNumbers = new int[array.length];
        int index = 0;
        String strNum;
        for (int i = 0; i < array.length; i++) {
            strNum = String.valueOf(array[i]);
            if (strNum.length() == 3 && strNum.charAt(0) != strNum.charAt(1) && strNum.charAt(1) != strNum.charAt(2) && strNum.charAt(0) != strNum.charAt(2)) {
                uniqueNumbers[index] = Integer.parseInt(strNum);
                index++;
            }
        }
        return Arrays.copyOf(uniqueNumbers, index);
    }

    public static int[] findFibonachiNumbers(Array arr) {
        if (arr != null) {
            // исключение
        }
        int[] array = arr.getValue();
        int[] uniqueNumbers = new int[array.length];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (isFibonachi(array[i])) {
                uniqueNumbers[index] = array[i];
                index++;
            }
        }
        return Arrays.copyOf(uniqueNumbers, index);
    }

    private static boolean isFibonachi(int num) {
        double tmp = 5 * num * num - 4;
        double tmp1 = 5 * num * num + 4;
        double sq = (int) Math.sqrt(tmp);
        double sq1 = (int) Math.sqrt(tmp1);
        return sq * sq == tmp || sq1 * sq1 == tmp1;
    }
}