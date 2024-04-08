package string.extract_substring;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        int one = scanner.nextInt();
        int two = scanner.nextInt();


        String result = str.substring(one, two + 1);
        System.out.println(result);
    }
}

