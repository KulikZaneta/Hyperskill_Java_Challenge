package object.product;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Product product = new Product();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter product name:");
        String productName = scanner.nextLine();
        product.setName(productName);

        System.out.println("Enter product price:");
        int productPrice = scanner.nextInt();
        product.setPrice(productPrice);

        System.out.println("Product name: " + product.getName());
        System.out.println("Product price: " + product.getPrice());

        scanner.close();
    }
}


