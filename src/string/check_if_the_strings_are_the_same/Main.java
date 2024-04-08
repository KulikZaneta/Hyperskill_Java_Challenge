package string.check_if_the_strings_are_the_same;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String one = scanner.nextLine().replaceAll("\\s", "");// replace(" ", "");
        String two = scanner.nextLine().replaceAll("\\s", "");

        boolean check = one.equals(two);
        System.out.println(check);
    }
}

