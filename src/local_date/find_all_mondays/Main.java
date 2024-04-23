package local_date.find_all_mondays;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            int year = scanner.nextInt();
            int month = scanner.nextInt();

            findMondays(year, month);
        } catch (Exception e) {
            System.out.println("Invalid input.");
        }
    }

    public static void findMondays(int year, int month) {
        LocalDate date = LocalDate.of(year, month, 1);
        while (date.getMonthValue() == month) {
            if (date.getDayOfWeek() == DayOfWeek.MONDAY) {
                System.out.println(date);
            }
            date = date.plusDays(1);
        }
    }
}

