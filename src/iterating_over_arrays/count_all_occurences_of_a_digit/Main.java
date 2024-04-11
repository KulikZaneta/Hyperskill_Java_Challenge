package iterating_over_arrays.count_all_occurences_of_a_digit;

public class Main {
    public static void main(String[] args) {
        int[] digit = {1, 2, 2, 3, 4, 4, 5};
        int[] occurrences = new int[10];

        sumAlOccurrenceDigit(digit, occurrences);
    }

    public static void sumAlOccurrenceDigit(int[] digit, int[] occurrences) {
        for (int i : digit) {
            if (i >= 0 && i <= 9) {
                occurrences[i]++;
            }
        }

        for (int i = 0; i < 10; i++)
            if (occurrences[i] > 0) {
                System.out.printf("%d: %d" + "\n", i, occurrences[i]);
            }
    }
}

