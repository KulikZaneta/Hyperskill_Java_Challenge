package _switch.count_area_of_figure;

public class Shape {
    public static double calculateTriangleArea(double a, double b, double c) {
        var p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public static double calculateCircleArea(double r) {
        return 3.14 * Math.pow(r, 2);
    }

    public static double calculateRectangleArea(double a, double b) {
        return a * b;
    }

    public static void print(double area) {
        System.out.println(area);
    }
}


