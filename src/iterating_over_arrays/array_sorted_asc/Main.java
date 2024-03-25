package iterating_over_arrays.array_sorted_asc;

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

        int[] sortedArray = Arrays.copyOf(array, array.length);
        Arrays.sort(sortedArray);

        boolean isAsc = Arrays.equals(array, sortedArray);
        System.out.println(isAsc);
    }
    /*
        boolean isAsc = false;

        for(int i = 0; i < array.length; i++) {
            if (array[i] < array[i + 1]) {
                isAsc = true;
                break;
            }
        }
    * */
}

