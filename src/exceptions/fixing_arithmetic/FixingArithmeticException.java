package exceptions.fixing_arithmetic;

import java.util.Scanner;

class FixingArithmeticException {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        try {
            int result = a / ((b + c) / d);
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Division by zero!");
        }

/*        if (b + c == 0 || d == 0 || (b + c) % d != 0) {
            System.out.println("Division by zero!");
        } else {
            int result = a / ((b + c) / d);
            System.out.println(result);
        }*/
    }
}
