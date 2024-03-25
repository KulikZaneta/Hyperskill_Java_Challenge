package object.book;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String title = sc.nextLine();
        String author = sc.nextLine();
        Book book = new Book();

        book.setAuthor(author);
        book.setTitle(title);
        book.setPages(100);

        System.out.println("Title: " + title + ", " + "Author: " + author + ", " + "Pages: " + book.getPages());
    }
}