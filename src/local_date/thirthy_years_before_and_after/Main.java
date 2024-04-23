package local_date.thirthy_years_before_and_after;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String inputDate = new Scanner(System.in).next();

        try {
            LocalDate date = LocalDate.parse(inputDate);

            LocalDate before30Y = date.minusYears(30);
            LocalDate after30Y = date.plusYears(30);
            System.out.println(before30Y.format(DateTimeFormatter.ISO_DATE));
            System.out.println(after30Y);
        } catch (Exception e) {
            System.out.println("Invalid date format. Please enter the date in the format YYYY-MM-DD.");
        }
    }
}

