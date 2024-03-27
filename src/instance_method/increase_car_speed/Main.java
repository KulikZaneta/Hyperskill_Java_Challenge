package instance_method.increase_car_speed;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int speed = scanner.nextInt();

        Car car = new Car(speed);
        car.accelerate();
        car.brake();
        System.out.println(car.speed);

        car.brake();
        System.out.println(car.speed);
    }
}

