package _switch.is_vovel;

import java.util.Scanner;

public class Main {
    public static boolean isVowel(char ch) {
        boolean result = switch (ch) {
            case 'a', 'A', 'e', 'E', 'i', 'I', 'o', 'O', 'U', 'u' -> true;
            default -> false;
        };
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char letter = scanner.nextLine().charAt(0);
        System.out.println(isVowel(letter) ? "YES" : "NO");
    }
}

