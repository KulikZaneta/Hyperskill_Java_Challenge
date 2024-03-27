package instance_method.clock;

public class Clock_24H {
    int hours = 12;
    int minutes = 0;


    public Clock_24H(int hours, int minutes) {
        this.hours = hours;
        this.minutes = minutes;
    }

    void next() {
        if (hours == 12 && minutes == 59) {
            minutes = 0;
            hours += 1;
        } else if (minutes >= 59) {
            minutes = 0;
            hours++;
        } else {
            minutes++;
        }
    }

    String getTimeString() {
        return String.format("%02d:%02d", hours, minutes);
    }
}


