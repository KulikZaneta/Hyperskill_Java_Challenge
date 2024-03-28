package overriding.area_of_shape;

class Circle extends Shape {
    double radius;

    @Override
    public double area() {
        return Math.PI * radius * radius; //Math.PI * Math.pow(radius, 2)
    }
}

