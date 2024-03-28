package npe.string;

import java.util.Scanner;

class FixingNullPointerException {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        string = "null".equals(string) ? null : string;

        System.out.println(string == null ? "NPE!" : string.toLowerCase());
    }
}

