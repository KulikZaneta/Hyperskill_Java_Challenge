package _super.vehicle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tires = scanner.nextInt();
        String color = scanner.next();
        int speed = scanner.nextInt();

        System.out.println(new Car(tires, color, speed));
        scanner.close();
    }
}

