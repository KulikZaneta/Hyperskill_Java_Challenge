package interfaces.shape;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String typeShape = scanner.nextLine();

        switch (typeShape) {
            case "Circle":
                Circle circle = new Circle();
                System.out.println(circle.name());
                System.out.println(circle.color());
                break;
            case "ColoredCircle":
                ColoredCircle coloredCircle = new ColoredCircle();
                System.out.println(coloredCircle.name());
                System.out.println(coloredCircle.color());
                break;
            default:
                System.out.println("Unknown shape");
        }
    }
}

