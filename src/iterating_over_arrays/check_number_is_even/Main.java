package iterating_over_arrays.check_number_is_even;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        evenNumberWithFor(numbers);
        System.out.println();
        evenNumberWithForEach(numbers);
    }

    public static boolean evenNumberWithFor(int[] numbers) {
        boolean isEven = false;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                isEven = true;
                System.out.print(numbers[i] + " ");
            }
        }
        return isEven;
    }

    public static boolean evenNumberWithForEach(int[] numbers) {
        boolean isEven = false;
        for (int num : numbers) {
            if (num % 2 == 0) {
                isEven = true;
                System.out.print(num + " ");
            }
        }
        return isEven;
    }
}
