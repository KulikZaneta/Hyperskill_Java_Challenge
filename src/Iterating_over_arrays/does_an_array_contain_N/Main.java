package Iterating_over_arrays.does_an_array_contain_N;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        int[] array = new int[size];

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        int n = scanner.nextInt();
        boolean isContain = false;

        for (int i = 1; i < size; i++) {
            if (array[i] == n) {
                isContain = true;
                break;
            }
        }

      /*  for (int i : array) {
            if (i == n) {
                isContain = true;
                break;
            }
        }*/
        System.out.println(isContain);
    }
}
