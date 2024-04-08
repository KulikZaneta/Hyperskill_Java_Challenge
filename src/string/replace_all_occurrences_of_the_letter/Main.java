package string.replace_all_occurrences_of_the_letter;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        String newStr = str.replace('a', 'b');
        System.out.println(newStr);
    }
}

