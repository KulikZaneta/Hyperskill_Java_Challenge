package string.check_string_ends_with_a_given_word;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        boolean check = str.endsWith("burg");
        System.out.println(check);
    }
}

