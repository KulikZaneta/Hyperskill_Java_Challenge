package object.calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        Calculator calculator = new Calculator();
        System.out.println(calculator.add(x, y));
    }
}