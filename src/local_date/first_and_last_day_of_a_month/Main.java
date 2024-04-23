package local_date.first_and_last_day_of_a_month;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            int year = scanner.nextInt();
            int month = scanner.nextInt();

            if (month < 1 || month > 12) {
                throw new IllegalArgumentException("Invalid month. Please enter a month from 1 to 12.");
            }

            LocalDate firstDayOfMonth = LocalDate.of(year, month, 1);
            LocalDate lastDayOfMonth =  LocalDate.of(year, month, firstDayOfMonth.lengthOfMonth());

            System.out.println(firstDayOfMonth);
            System.out.println(lastDayOfMonth);
        } catch (Exception e) {
            System.out.println("Invalid date.");
        }
    }
}


