package methods.check_number_is_positive_or_negative;

import java.util.Scanner;

public class Main {

    public static int sign(int number) {
        if(number > 0) {
            return 1;
        } else if(number < 0) {
            return -1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();
        System.out.println(sign(n));
    }
}

