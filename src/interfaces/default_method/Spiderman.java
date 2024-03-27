package interfaces.default_method;

public class Spiderman implements Movable, Jumpable {
    public void stepAhead() {}
    public void turnLeft() {}
    public void turnRight() {}
    public void jump() {}
    public void turnLeftJump() {}
    public void turnRightJump() {}

    // define an implementation for conflicting default method
    public void turnAround() {
        Movable.super.turnAround();
        //Jumpable.super.turnAround();
        /*
        Problem polegający na tym, że klasa implementuje różne interfejsy,
        które mają domyślną metodę z tą samą sygnaturą, nazywany jest problemem diamentu .
         */
    }
}

