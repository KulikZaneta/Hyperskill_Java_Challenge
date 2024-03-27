package instance_method.clock;

public class Clock_12H {
    int hours = 12;
    int minutes = 0;


    public Clock_12H(int hours, int minutes) {
        this.hours = hours;
        this.minutes = minutes;
    }

    void next() {
        if (hours == 12 && minutes == 59) {
            minutes = 0;
            hours = 1;
        } else if (minutes >= 59) {
            minutes = 0;
            hours = (hours + 1) % 12;
        } else {
            minutes++;
        }
    }

    String getTimeString() {
        return String.format("%02d:%02d", hours, minutes);
    }
}

