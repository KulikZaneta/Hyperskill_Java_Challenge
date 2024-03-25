package constructors.cirlce;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        Circle circle;

        if (n > 0) {
            circle = new Circle(n);
        } else {
            circle = new Circle();
        }

        System.out.println(circle.getRadius() + " " + circle.getArea());
        scanner.close();
    }
}

