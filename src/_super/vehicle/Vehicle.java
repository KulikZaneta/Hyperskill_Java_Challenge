package _super.vehicle;

public class Vehicle {
    protected int countTire;

    protected String color;

    public Vehicle(int countTire, String color) {
        this.countTire = countTire;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "countTire=" + countTire +
                ", color='" + color + '\'' +
                '}';
    }
}


