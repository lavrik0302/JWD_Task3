package by.epamtc.jwd.task1.logic;

import by.epamtc.jwd.task1.util.Scan;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FillArray {
    public static void fillRandom(int[] array, int range) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * range);
        }
    }

    public static void fillFromFile(int[] array, String path) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(path));
        int index = 0;
        while (scanner.hasNextInt() && index < array.length) {
            array[index] = scanner.nextInt();
            index++;
        }
        scanner.close();
    }

    public static void fillFromConsole(int[] array) {
        for (int i = 0; i < array.length; i++){
            array[i] = Scan.getInt();
        }
    }
}
