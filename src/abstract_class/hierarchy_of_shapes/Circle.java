package abstract_class.hierarchy_of_shapes;

class Circle extends Shape {

    final double PI = Math.PI;

    private double radius;

    public Circle(double radius) {
        super();
        this.radius = radius;
    }

    @Override
    double getPerimeter() {
        return 2 * PI * radius;
    }

    @Override
    double getArea() {
        return PI * Math.pow(radius, 2);
    }
}

