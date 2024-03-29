package _static.calculator_with_history;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int initialValue = scanner.nextInt();
        int additionValue = scanner.nextInt();
        int multiplicationValue = scanner.nextInt();

        Calculator calculator = new Calculator(initialValue);
        calculator.add(additionValue);
        calculator.multiply(multiplicationValue);

        System.out.println(calculator.getValue());
        System.out.println(Calculator.showHistory());
    }
}

