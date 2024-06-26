package exceptions.convert_type_with_try_catch;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = null;

        while (!scanner.hasNext("0")) {
            try {
                str = scanner.next();
                System.out.println(Integer.parseInt(str) * 10);
            } catch (NumberFormatException e) {
                System.out.println("Invalid user input: " + str);
            }
        }
    }
}
