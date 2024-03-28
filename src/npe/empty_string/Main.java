package npe.empty_string;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static String toUpperCase(String str) {
        try {
            return str != null ? str.toUpperCase(Locale.ENGLISH) : "";
        } catch (Exception e) {
            return "Error converting string to upper case";
        }
    }
    //        String strNonNull = Optional.ofNullable(str).orElse("");

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        line = "null".equalsIgnoreCase(line) ? null : line;
        System.out.println(toUpperCase(line));
    }
}

