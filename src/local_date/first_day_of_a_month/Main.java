package local_date.first_day_of_a_month;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            int year = scanner.nextInt();
            int dayOfYear = scanner.nextInt();

            LocalDate date = LocalDate.ofYearDay(year, dayOfYear);

            boolean isFirstDayOfMonth = isFirstDayOfMonth(date);
            System.out.println(isFirstDayOfMonth);
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter valid integer values for year and day of the year.");
        } finally {
            scanner.close();
        }
    }

    public static boolean isFirstDayOfMonth (LocalDate date) {
        return date.getDayOfMonth() == 1;
    }
}



