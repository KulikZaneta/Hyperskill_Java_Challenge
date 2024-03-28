package methods.factorial;

import java.util.Scanner;

public class Main {

    public static long factorial(long n) {
        if(n == 0) {
            return 1;
        }
        long x = 1;
        for(int i = 1; i <= n; i++) {
            x *= i;

        }
        return x;
    }

    // return n <= 1 ? 1 : n * factorial(n - 1);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = Integer.parseInt(scanner.nextLine().trim());
        System.out.println(factorial(n));
    }
}



