package iterating_over_arrays.multiplied_array_digits;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] squares = new int[10];
        multiplyDigit(squares);


    }
    public static void multiplyDigit(int[] squares) {
        for (int i = 0; i < squares.length; i++) {
            squares[i] = i * i;
        }
        System.out.println(Arrays.toString(squares));
    }
}

