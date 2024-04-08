package array.binary_search;

import java.util.Arrays;

public class BinarySearch {
    public static int callBinarySearch(int[] nums, int key) {
        return Arrays.binarySearch(nums, key);
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        int key = 5;
        int result = callBinarySearch(nums, key);
        System.out.println("Index of " + key + " is " + result);
    }
}

