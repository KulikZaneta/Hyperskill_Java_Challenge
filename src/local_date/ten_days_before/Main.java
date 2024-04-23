package local_date.ten_days_before;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String inputDate = new Scanner(System.in).next();

        try {
            LocalDate date = LocalDate.parse(inputDate);

            LocalDate tenDaysBefore = date.minusDays(10);
            System.out.println(tenDaysBefore.format(DateTimeFormatter.ISO_DATE));
        } catch (Exception e) {
            System.out.println("Invalid date format. Please enter the date in the format YYYY-MM-DD.");
        }
    }
}

