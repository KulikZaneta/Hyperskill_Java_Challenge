package _switch.choose_number;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String choose = scanner.next();

        switch (choose) {
            case "one":
                System.out.println(1);
                break;

            case "two":
                System.out.println(2);
                break;

            case "three":
                System.out.println(3);
                break;

            case "four":
                System.out.println(4);
                break;

            case "five":
                System.out.println(5);
                break;

            case "six":
                System.out.println(6);
                break;

            case "seven":
                System.out.println(7);
                break;

            case "eight":
                System.out.println(8);
                break;

            case "nine":
                System.out.println(9);
                break;
        }
        String[] arr = {"zero", "one", "two", "three", "four",
                "five", "six", "seven", "eight", "nine"};
        String value = new Scanner(System.in).next().toLowerCase();
        System.out.println(Arrays.asList(arr).indexOf(value));
    }
}


