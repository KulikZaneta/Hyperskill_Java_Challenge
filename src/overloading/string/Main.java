package overloading.string;

import java.util.Scanner;

public class Main {
    public static void print(String strArg) {
        System.out.println("print(\"" + strArg + "\")");
    }

    public static void print(String strArg, int number) {
        System.out.println("print(\"" + strArg + "\", " + number + ")");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int val = scanner.nextInt();
        print(str);
        print(str, val);
    }
}


