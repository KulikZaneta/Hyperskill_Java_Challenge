package abstract_class.zoo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String animalType = scanner.nextLine().toLowerCase();

        switch (animalType) {
            case "dog": System.out.println(new Dog().sound());
                break;
            case "cat": System.out.println(new Cat().sound());
                break;
            default:
                System.out.println("Unknown sound");
        }
        scanner.close();
    }
}

