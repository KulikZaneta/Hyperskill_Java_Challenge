package constructors.book;

import java.util.Scanner;

public class Main {
    public static void main(String [] arg) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(",");
        String title = input[0];
        String author = input[1];

        System.out.println(new Book(title, author).getBookInfo());
    }
}

