package iterating_over_arrays.sum_elements_greater_than_n;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        int[] array = new int[size];
        int n = scanner.nextInt();

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        int result = sumElementsGreaterThanN(array, n);
        System.out.println(result);
    }

    public static int sumElementsGreaterThanN(int[] array, int n) {
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            if (n < array[i]) {
                result += array[i];
            }
        }
        return result;
    }
}

