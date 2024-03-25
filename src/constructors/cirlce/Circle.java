package constructors.cirlce;

class Circle {
    private int radius;
    private int area;

    public Circle() {
        this.radius = 1;
        calculateArea();
    }

    public Circle(int radius) {
        if (radius > 0) {
            this.radius = radius;
        } else {
            this.radius = 1;
        }
        calculateArea();
    }

    private void calculateArea() {
        this.area = (int) Math.round(Math.PI * Math.pow(radius, 2));
    }

    public int getRadius() {
        return radius;
    }

    public int getArea() {
        return area;
    }
}

