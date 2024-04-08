package random.sum_of_the_first_n_random_numbers;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        Random random = new Random(a + b);
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int randomNum = random.nextInt(b - a + 1) + a;
            sum += randomNum;
        }
        System.out.println(sum);
    }
}

