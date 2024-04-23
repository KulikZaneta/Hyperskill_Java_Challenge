package local_date.convert_numbers_to_days;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            int year = scanner.nextInt();
            int numberOne = scanner.nextInt();
            int numberTwo = scanner.nextInt();
            int numberThree = scanner.nextInt();

            LocalDate date1 = convertNumbersToDate(year, numberOne);
            LocalDate date2 = convertNumbersToDate(year, numberTwo);
            LocalDate date3 = convertNumbersToDate(year, numberThree);

            System.out.println(date1);
            System.out.println(date2);
            System.out.println(date3);
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter valid integer values for year and day of the year.");
        }
    }

    public static LocalDate convertNumbersToDate(int year, int dayOfYear) {
        return LocalDate.ofYearDay(year, dayOfYear);
    }
}

