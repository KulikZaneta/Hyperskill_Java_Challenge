package Iterating_over_arrays.index_first_max_array;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        int[] array = new int[size];

        int maxIndex = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();

            if (array[i] > array[maxIndex]) {
                maxIndex = i;
            }
        }
        System.out.println(maxIndex);
    }
}

