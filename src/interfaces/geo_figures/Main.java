package interfaces.geo_figures;

public class Main {
    public static void main(String[] args) {
        MutableShape circle = new Circle(2.0f, 3.5f, 10.1f);
        circle.move(10.1f, 20.2f);
        circle.scale(2.2f);

        System.out.println("Circle radius after move and scale: " + ((Circle) circle).getRadius());


        MutableShape rectangle = new Rectangle(1.0f, 1.0f, 5.0f, 3.0f);
        rectangle.move(5.0f, 2.0f);
        rectangle.scale(1.5f);
        System.out.println("Rectangle width after move and scale: " + ((Rectangle) rectangle).getWidth());
        System.out.println("Rectangle height after move and scale: " + ((Rectangle) rectangle).getHeight());
    }
}

