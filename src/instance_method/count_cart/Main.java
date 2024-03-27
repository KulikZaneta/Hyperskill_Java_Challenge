package instance_method.count_cart;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Cart cart = new Cart();

        Scanner scanner = new Scanner(System.in);
        String pricesInput = scanner.nextLine();
        String[] prices = pricesInput.split(" ");

        for (String price : prices) {
            int itemPrice = Integer.parseInt(price);
            cart.addToCart(itemPrice);
        }

        int totalPrice = cart.getTotal();
        System.out.println(totalPrice);
    }
}


