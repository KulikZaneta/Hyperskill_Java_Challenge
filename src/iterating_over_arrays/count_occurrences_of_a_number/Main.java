package iterating_over_arrays.count_occurrences_of_a_number;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        int n = scanner.nextInt();
        int sum = countOccurrences(array, n);

        System.out.println(sum);
    }

    public static int countOccurrences(int[] array, int n) {
        int sum = 0;
        for (int num : array) {
            if (num == n) {
                sum++;
            }
        }
        return sum;
    }
}



