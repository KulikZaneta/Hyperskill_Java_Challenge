package array.desc_sort_in_the_array;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
        /*Integer*/
        Integer[] numbers = {8, 2, 7, 3, 1, 5};
        sortArrayWithInteger(numbers);
        System.out.println(Arrays.toString(numbers));

        for (int number : numbers) {
            System.out.print(number + " ");
        }

        /*String*/
        String[] str = {"a", "b", "d", "c"};
        sortArrayWithString(str);
        System.out.println();
        System.out.println(Arrays.toString(str));


        /*int*/
        int[] array = {5, 2, 7, 1, 9};
        array = sortArrayWithInt(array);
        System.out.println(Arrays.toString(array));

        for (int number : array) {
            System.out.print(number + " ");
        }
    }

    public static Integer[] sortArrayWithInteger(Integer[] array) {
        //Arrays.sort(numbers, Collections.reverseOrder());
        Arrays.sort(array, Comparator.reverseOrder());//Comparator only object type
        return array;
    }

    public static String[] sortArrayWithString(String[] array) {
        Arrays.sort(array, Comparator.reverseOrder());
        return array;
    }

    public static int[] sortArrayWithInt(int[] array) {
        return Arrays.stream(array)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .mapToInt(Integer::intValue)
                .toArray();
    }
}

