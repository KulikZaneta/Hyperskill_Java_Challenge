package methods.return_number_as_power;

import java.util.Scanner;

public class Main {

    public static long power(int n, int m) {
        double result = Math.pow(n, m);
        return (long) result;
    }

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();
        final int m = scanner.nextInt();
        System.out.println(power(n, m));
    }
}

