package interfaces.default_method;

public class Batman implements Movable {
    public void stepAhead() {}
    public void turnLeft() {}
    public void turnRight() {}

    public static void main(String[] args) {
        Batman batman = new Batman();
        batman.stepAhead();
        batman.turnLeft();
        batman.turnRight();
        batman.turnAround();
    }
}

