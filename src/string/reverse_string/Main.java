package string.reverse_string;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        StringBuilder builder = new StringBuilder(input);
        builder.reverse();
        builder.toString();
        System.out.println(builder);

        scanner.close();
    }
}

