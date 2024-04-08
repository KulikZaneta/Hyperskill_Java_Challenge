package array.sum_numbers_divisible_by_3;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int sum = 0;
        int[] array = new int[n];

        for(int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        for(int x : array) {
            if (x % 3 == 0) {
                sum += x;
            }
        }
        System.out.println("Sum of elements that are multiples of 3: " + sum);
        scanner.close();
    }
}



