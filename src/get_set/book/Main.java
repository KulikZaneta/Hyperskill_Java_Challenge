package get_set.book;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Book book = new Book();

        String title = scanner.nextLine();
        String author = scanner.nextLine();
        int pages = scanner.nextInt();

        book.setTitle(title);
        book.setAuthor(author);
        book.setNumberOfPages(pages);

        System.out.println(book.getTitle());
        System.out.println(book.getAuthor());
        System.out.println(book.getNumberOfPages());

        scanner.close();
    }
}

