package local_date.get_info_on_a_day;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.next();

        try {
            LocalDate date = LocalDate.parse(input);

            int numberDayOfYear = date.getDayOfYear();
            int numberDayOfMonth = date.getDayOfMonth();

            System.out.println(numberDayOfYear + " " + numberDayOfMonth);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

