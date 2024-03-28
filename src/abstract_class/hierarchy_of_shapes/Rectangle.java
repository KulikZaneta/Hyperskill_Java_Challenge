package abstract_class.hierarchy_of_shapes;

class Rectangle extends Shape {
    private double a, b;

    public Rectangle(double a, double b) {
        super();
        this.a = a;
        this.b = b;
    }

    @Override
    double getPerimeter() {
        return 2 * (a + b);
    }

    @Override
    double getArea() {
        return a * b;
    }
}

