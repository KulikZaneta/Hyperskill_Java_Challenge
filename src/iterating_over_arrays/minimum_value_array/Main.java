package iterating_over_arrays.minimum_value_array;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        int[] array = new int[size];

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        minimumValue(array);
    }

    public static void minimumValue(int[] array) {
        Arrays.sort(array);
        System.out.println(array[0]);
    }
}

