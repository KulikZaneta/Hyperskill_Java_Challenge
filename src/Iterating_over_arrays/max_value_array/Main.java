package Iterating_over_arrays.max_value_array;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        int[] array = new int[size];

        for (int i = 0 ; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        int max = 0;
        for (int i : array) {
            if (i > max) {
                max = i;
            }
        }

        System.out.println(max);
    }
}

