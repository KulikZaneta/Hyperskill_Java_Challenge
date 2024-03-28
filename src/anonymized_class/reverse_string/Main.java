package anonymized_class.reverse_string;

import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();

        StringReverser reverser = new StringReverser() {
            @Override
            public String reverse(String str) {
                StringBuilder sb = new StringBuilder(line);
                sb.reverse();
                return sb.toString();
            }
        };
        //        StringReverser reverser = str -> new StringBuilder(str).reverse().toString();

        System.out.println(reverser.reverse(line));
    }
}

