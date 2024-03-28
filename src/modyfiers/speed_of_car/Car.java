package modyfiers.speed_of_car;

class Car {
    private int speed;

    public Car() {
        this.speed = 0;
    }

    public void drive(int increase) {
        this.speed += increase;
        if(this.speed > 200) {
            this.speed = 200;
        }
    }

    public void displaySpeed() {
        System.out.println(this.speed);
    }
}

