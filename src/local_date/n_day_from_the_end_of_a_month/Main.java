package local_date.n_day_from_the_end_of_a_month;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            int year = scanner.nextInt();
            int month = scanner.nextInt();
            int daysLeft = scanner.nextInt();

            LocalDate date = date(year, month, daysLeft);
            System.out.println(date);
        } catch (Exception e) {
            System.out.println("Invalid input.");
        }
    }

    public static LocalDate date(int year, int month, int day) {
        return LocalDate.of(year, month, 1).plusMonths(1).minusDays(day);
    }
}

