package instance_method.increase_car_speed;

class Car {

    int yearModel;
    String make;
    int speed;

    public Car(int speed) {
        this.speed = speed;
    }

    public void accelerate() {
        this.speed  += 5;
    }

    public void brake() {
        if (this.speed >= 0) {
            speed -= 5;
        } else {
            this.speed = 0;
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "yearModel=" + yearModel +
                ", make='" + make + '\'' +
                ", speed=" + speed +
                '}';
    }
}