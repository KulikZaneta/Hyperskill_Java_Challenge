package instance_method.clock;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hours = scanner.nextInt();
        int minutes = scanner.nextInt();

        Clock_12H clock12 = new Clock_12H(hours, minutes);
        clock12.next();
        System.out.println(clock12.getTimeString());

        Clock_24H clock24 = new Clock_24H(hours, minutes);
        clock24.next();
        System.out.println(clock24.getTimeString());
    }
}

