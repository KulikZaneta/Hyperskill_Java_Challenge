package random.find_the_seed_between_a_and_b;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        int minMax = Integer.MAX_VALUE;
        int seedWithMinMax = a;
        Random random = new Random(a);

        for (int i = a; i <= b; i++) {
            random.setSeed(i);
            int max = 0;
            for (int j = 0; j < n; j++) {
                int randomNumber = random.nextInt(k);
                max = Math.max(max, randomNumber);
            }
            if (max < minMax) {
                minMax = max;
                seedWithMinMax = i;
            }
        }
        System.out.println(seedWithMinMax + "\n" + minMax);
    }
}

