package overriding.area_of_shape;

class Square extends Shape {
    double side;

    @Override
    public double area() {
        return side * side;
    }
}

