package Object.Calculating_area_of_a_rectangle;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
    static class Rectangle {
        private double width;

        private double height;

        public Rectangle(double width, double height) {
            this.width = width;
            this.height = height;
        }

        public double calculateArea() {
            return width * height;
        }


        public double getWidth() {
            return width;
        }

        public double getHeight() {
            return height;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double width = scanner.nextDouble();
        double height = scanner.nextDouble();

        Rectangle rectangle = new Rectangle(width, height);
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.println(df.format(rectangle.calculateArea()));
    }
}
