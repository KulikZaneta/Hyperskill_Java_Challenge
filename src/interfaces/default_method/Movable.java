package interfaces.default_method;

public interface Movable {
    void stepAhead();
    void turnLeft();
    void turnRight();

    default void turnAround() {
        turnLeft();
        turnRight();
        System.out.println("yep baby");
    }
}
