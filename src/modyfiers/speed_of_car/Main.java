package modyfiers.speed_of_car;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputSpeed = scanner.nextInt();

        Car car = new Car();
        car.drive(inputSpeed);
        car.displaySpeed();
    }
}

