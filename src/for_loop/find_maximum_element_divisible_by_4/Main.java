package for_loop.find_maximum_element_divisible_by_4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int max = 0;
        int amountOfElements = scanner.nextInt();

        for(int i = 0; i < amountOfElements; i++) {
            int hasNext = scanner.nextInt();
            if(hasNext % 4 == 0 && hasNext > max) {
                max = hasNext;
            }
        }
        System.out.println(max);
    }
}

