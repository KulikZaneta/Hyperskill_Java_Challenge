package random.gaussian;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int n = scanner.nextInt();
        double m = scanner.nextDouble();


        while (!isFound(k, n, m)) {
            k++;
        }
        System.out.println(k);
    }

    static boolean isFound(int k, int n, double m) {
        Random random = new Random(k);
        for (int i = 0; i < n; i++) {
            if (random.nextGaussian() > m) {
                return false;
            }
        }
        return true;
    }
}

