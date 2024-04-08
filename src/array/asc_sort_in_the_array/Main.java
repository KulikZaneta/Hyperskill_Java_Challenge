package array.asc_sort_in_the_array;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void sortArray(int[] numbers) {
        Arrays.sort(numbers);
    }

    public static Integer[] sortArray(Integer[] array) {
        Arrays.sort(array);
        return array;
    }

    public static String[] sortArray(String[] array) {
        Arrays.sort(array);
        return array;
    }

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        String[] values = scanner.nextLine().split("\\s+");
        int[] numbers = Arrays.stream(values)
                .mapToInt(Integer::parseInt)
                .toArray();
        sortArray(numbers);
        Arrays.stream(numbers).forEach(e -> System.out.print(e + " "));

        System.out.println();

        Integer[] arr = {13, 7, 6, 45, 21, 9, 2, 100};
        sortArray(arr);
        System.out.println(Arrays.toString(arr));

        String[] str = { "y", "d", "b", "u", "t", "f", "m", "h"};
        sortArray(str);
        System.out.println(Arrays.toString(str));

        int[] number = { 2, 5, 7, 2, 9};
        sortArray(number);
        System.out.println(Arrays.toString(number));
    }
}

