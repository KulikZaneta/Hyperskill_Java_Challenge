package for_loop.counting_all_types_of_grades;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int countD = 0;
        int countC = 0;
        int countB = 0;
        int countA = 0;

        for (int i = 0; i < n; i++) {
            char grade = scanner.next().charAt(0);

            switch (grade) {
                case 'D':
                    countD++;
                    break;
                case 'C':
                    countC++;
                    break;
                case 'B':
                    countB++;
                    break;
                case 'A':
                    countA++;
                    break;

                default:
                    System.out.println("Invalid grade entered: " + grade);
            }
        }
        System.out.println(countD + " " + countC + " " + countB + " " + countA);
    }
}
