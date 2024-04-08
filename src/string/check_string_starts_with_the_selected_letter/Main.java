package string.check_string_starts_with_the_selected_letter;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();

        boolean check = str.toLowerCase().startsWith("j");
        System.out.println(check);
    }
}

