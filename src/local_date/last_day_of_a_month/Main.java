package local_date.last_day_of_a_month;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            int year = scanner.nextInt();
            int dayOfYear = scanner.nextInt();

            LocalDate date = LocalDate.ofYearDay(year, dayOfYear);

            boolean isLastDayOfMonth = isLastDay(date);
            System.out.println(isLastDayOfMonth);
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter valid integer values for year and day of the year.");
        } finally {
            scanner.close();
        }
    }

    public static boolean isLastDay(LocalDate date) {
        boolean isLast = false;
        int lengthOfMonth = date.lengthOfMonth();

        if (date.getDayOfMonth() == lengthOfMonth) {
            isLast = true;
        }
        return isLast;
    }
}

