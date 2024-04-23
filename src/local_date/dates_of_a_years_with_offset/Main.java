package local_date.dates_of_a_years_with_offset;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            LocalDate date = LocalDate.parse(scanner.next());
            int day = scanner.nextInt();

            datesWithOffSet(date, day);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void datesWithOffSet(LocalDate date, int days) {
        LocalDate currentDate = date;
        while (currentDate.getYear() == date.getYear()) {
            System.out.println(currentDate);
            currentDate = currentDate.plusDays(days);
        }
    }
}

