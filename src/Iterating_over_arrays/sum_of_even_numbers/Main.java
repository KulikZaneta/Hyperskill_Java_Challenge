package Iterating_over_arrays.sum_of_even_numbers;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] numbers = input.split(",");
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            int num = Integer.parseInt(numbers[i].trim());
            if (num % 2 == 0) {
                sum += num;
            }
        }
        System.out.println(sum);
    }
}
