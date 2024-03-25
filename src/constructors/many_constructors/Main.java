package constructors.many_constructors;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String line = input.nextLine();
        Book book;

        String[] parts = line.split(",");
        if (parts.length == 3) {
            String title = parts[0];
            String author = parts[1];
            double price = Double.parseDouble(parts[2]);
            book = new Book(title, author, price);
        } else {
            String title = parts[0];
            String author = parts[1];
            book = new Book(title, author);
        }

        System.out.println(book.getDetails());
    }
}

