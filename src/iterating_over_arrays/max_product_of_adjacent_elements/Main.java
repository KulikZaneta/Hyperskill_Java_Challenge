package iterating_over_arrays.max_product_of_adjacent_elements;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        int[] array = new int[size];

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        int max = maxProductOfAdjacentElements(array);
        System.out.println(max);
    }

    public static int maxProductOfAdjacentElements(int[] array) {
        int max = 0;
        for (int i = 0; i < array.length - 1; i++) {
            int product = array[i] * array[i + 1];
            if (product > max) {
                max = product;
            }
        }
        return max;
    }
}

