package methods.divide_number_and_convert;

import java.util.Scanner;

public class Main {

    public static double divide(long a, long b) {
        double result = 0;
        if(b != 0) {
            result =  (double) a / b;
        }

        return result;
    }

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final long a = scanner.nextLong();
        final long b = scanner.nextLong();
        System.out.println(divide(a, b));
    }
}

