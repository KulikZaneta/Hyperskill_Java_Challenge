package _switch.calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long digitOne = scanner.nextLong();
        String operation = scanner.next();
        //char operation = operatorStr.charAt(0);
        long digitTwo = scanner.nextLong();

        switch (operation) {
            case "+":
                System.out.println(digitOne + digitTwo);
                break;

            case "-":
                System.out.println(digitOne - digitTwo);
                break;

            case "/":
                if (digitTwo == 0) {
                    System.out.println("Division by 0!");
                } else {
                    System.out.println(digitOne / digitTwo);
                }
                break;

            case "*":
                System.out.println(digitOne * digitTwo);
                break;

            default:
                System.out.println("Unknown operator");
                break;
        }
    }
}

