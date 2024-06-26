package array.get_find_and_last_number;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static int[] getFirstAndLast(int[] array) {
        int[] result = new int[2];
        if (array.length > 0) {
            result[0] = array[0];
            result[1] = array[array.length - 1];
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int[] result = getFirstAndLast(array);
        Arrays.stream(result).forEach(e -> System.out.print(e + " "));
    }
}

