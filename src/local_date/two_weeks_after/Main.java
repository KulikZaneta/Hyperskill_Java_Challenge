package local_date.two_weeks_after;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String inputDate = new Scanner(System.in).next();;

        try {
            LocalDate date = LocalDate.parse(inputDate);

            LocalDate twoWeeksLater = date.plusWeeks(2);
            System.out.println("Date 2 weeks later: " + twoWeeksLater.format(DateTimeFormatter.ISO_DATE));
        } catch (Exception e) {
            System.out.println("Invalid date format. Please enter the date in the format YYYY-MM-DD.");
        }
    }
}

