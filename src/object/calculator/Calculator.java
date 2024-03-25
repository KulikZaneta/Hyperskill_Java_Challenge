package object.calculator;

class Calculator {
    private int x;
    private int y;

    public Calculator() {
        this.x = 0;
        this.y = 0;
    }

    public int add(int x, int y) {
        return x + y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
}