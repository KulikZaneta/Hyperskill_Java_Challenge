package for_loop.find_sum_of_the_numbers_divisible_by_6;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int amountOfElements = scanner.nextInt();
        int sum = 0;

        for(int i = 0; i < amountOfElements; i++) {
            int next = scanner.nextInt();
            if(next % 6 == 0) {
                sum += next;
            }
        }
        System.out.println(sum);
    }
}

/*
If we don't have the given number of input elements, check if the next element is present
while(scanner.hasNextInt()) {
    int next = scanner.nextInt();
    if(next % 6 == 0) {
        sum += next;
    }
}*/