package iterating_over_arrays.triples;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        int[] array = new int[size];

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        int triplesCount = countTriples(array);
        System.out.println(triplesCount);
    }

    public static int countTriples(int[] array) {
        int triplesCount = 0;
        for (int i = 0; i < array.length - 2; i++) {
            if (array[i] + 1 == array[i + 1] && array[i + 1] + 1 == array[i + 2]) {
                triplesCount++;
            }
        }
        return triplesCount;
    }
}


