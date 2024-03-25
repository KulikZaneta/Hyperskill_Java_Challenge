package Iterating_over_arrays.alphabetical_order;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();
        String[] word = sentence.split(" ");
        boolean isAsc = true;

        for (int i = 0; i < word.length - 1; i++) {
            if (word[i].compareTo(word[i + 1]) < 0) {
                isAsc = false;
                break;
            }
        }
        System.out.println(isAsc);
    }
}

