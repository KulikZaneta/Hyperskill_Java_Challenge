package interfaces.area_circle;

public class Circle implements Measurable {

    private static double PI = Math.PI;
    private double radius;


    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return PI * Math.pow(radius, 2);
    }
}

