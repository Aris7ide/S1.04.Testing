package N1.com.service;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ConsoleReader {

    static Scanner scanner = new Scanner(System.in);

    public static String readString(String message) {
        System.out.println(message);
        while (true) {
            try {
                String value = scanner.nextLine();
                scanner.nextLine();
                return value;
            } catch (InputMismatchException e) {
                System.err.println(e.getMessage());
            }
        }
    }

    public static int readInt(String message) {
        System.out.println(message);
        while (true) {
            try {
                int value = scanner.nextInt();
                return value;
            } catch (InputMismatchException e) {
                System.err.println(e.getMessage());
            }
        }
    }
}
