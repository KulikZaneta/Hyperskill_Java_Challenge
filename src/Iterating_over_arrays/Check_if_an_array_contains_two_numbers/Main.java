package Iterating_over_arrays.Check_if_an_array_contains_two_numbers;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        boolean isClose = false;

        for (int i = 1; i < size; i++) {
            if ((array[i] == m && array[i - 1] == n) || (array[i] == n && array[i - 1] == m)) {
                isClose = true;
            }
        }
        System.out.println(isClose);
    }
}
