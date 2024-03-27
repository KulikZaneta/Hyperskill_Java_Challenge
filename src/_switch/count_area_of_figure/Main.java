package _switch.count_area_of_figure;

import java.util.Scanner;

import static _switch.count_area_of_figure.Shape.print;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        var shapeType = scanner.next();

        switch (shapeType) {
            case "triangle": {
                var a = scanner.nextDouble();
                var b = scanner.nextDouble();
                var c = scanner.nextDouble();
                print(Shape.calculateTriangleArea(a, b, c));
                break;
            }
            case "circle": {
                var r = scanner.nextDouble();
                print(Shape.calculateCircleArea(r));
                break;
            }
            case "rectangle": {
                var a = scanner.nextDouble();
                var b = scanner.nextDouble();
                print(Shape.calculateRectangleArea(a, b));
                break;
            }
            default:
                System.out.println("Unknown shape type " + shapeType);
        }
    }
}

