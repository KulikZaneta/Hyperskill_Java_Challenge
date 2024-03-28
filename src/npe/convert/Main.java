package npe.convert;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        System.out.println(safeToString(input));
        scanner.close();
    }

    public static String safeToString(Object obj) {
        try {
            return obj != null ? obj.toString() : "null";
        } catch (Exception e) {
            return "Error converting object to string";
        }
    }
}

