package by.epamtc.jwd.task1.util;

import java.util.Scanner;

public class Scan {
    public static int getInt() {
        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNextInt())
            scanner.next();
        return scanner.nextInt();
    }

    public static double getDouble() {
        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNextDouble())
            scanner.next();
        return scanner.nextDouble();
    }
}
