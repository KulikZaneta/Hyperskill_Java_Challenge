package for_loop.how_many_numbers_between_a_and_b_are_divisible_by_n;
/*ile liczb między a i b jest podzielnych przez n.
liczby a=15, b=25 i n=5,
twój program powinien sprawdzić, ile liczb od 15 do 25 jest podzielnych przez 5 -->
w tym przypadku są to 3 liczby (--> 15 , 20, 25) */


import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int n = scanner.nextInt();
        int count = 0;

        for(int i = a; i <=b; i++) {
            if(i % n == 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
