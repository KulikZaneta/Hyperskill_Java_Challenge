package for_loop.return_ratio_of_numbers_between_a_and_b;

import java.util.Scanner;

/*zwroc iloczyn liczb pomiedzy a i b, uwzglenij a i wyklucz b*/

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextLong();
        long b = scanner.nextLong();
        long x = 1L;


        for(long i = a; i < b; i++) {
            x = x * i;
        }
        System.out.println(x);
    }
}


/*        while(a < b) {
            x = x * a;
            a++;
        }*/
