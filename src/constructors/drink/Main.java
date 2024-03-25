package constructors.drink;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int price = scanner.nextInt();

        Drink drink = new Drink(name, price);
        System.out.println(drink.getPrice());

        //System.out.println(new Drink(name, price).getPrice());
    }
}