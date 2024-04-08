package array.sort_number_as_string;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        String[] arr = { "13", "7", "6", "45", "21", "9", "2", "100"};


        Arrays.sort(arr, Comparator.comparingInt(Integer::parseInt));
        System.out.println("Rosnąco: " + Arrays.toString(arr));

        Arrays.sort(arr, (a, b) -> Integer.parseInt(a) - Integer.parseInt(b));
        System.out.println("Rosnąco: " + Arrays.toString(arr));



        Arrays.sort(arr, Comparator.comparingInt(i -> Integer.valueOf((String) i)).reversed());
        System.out.println("Malejąco: " + Arrays.toString(arr));

        Arrays.sort(arr, (c, d) -> Integer.parseInt(d) - Integer.parseInt(c));
        System.out.println("Malejąco: " + Arrays.toString(arr));


    }
}

