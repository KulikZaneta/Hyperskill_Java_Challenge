package _super.vehicle;

public class Car extends Vehicle {
    protected int speed;

    public Car(int countTire, String color, int speed) {
        super(countTire, color);
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Tires: " + countTire +
                ", Color: " + color +
                ", Speed: " + speed;
    }
}


