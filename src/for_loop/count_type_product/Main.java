package for_loop.count_type_product;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int countOk = 0;
        int countSmall = 0;
        int countBig = 0;

        for(int i = 0; i < n; i++) {
            int hasNext = scanner.nextInt();
            if(hasNext == -1) {
                countSmall++;
            } else if(hasNext == 1) {
                countBig++;
            } else {
                countOk++;
            }
        }

        System.out.println(countOk + " " + countBig + " " + countSmall);
    }
}