package local_date.similar_date;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        System.out.println(LocalDate.parse("2017-11-12").minusMonths(1));

        System.out.println(LocalDate.parse("2017-01-01").withMonth(11).withDayOfMonth(11));

        System.out.println(LocalDate.parse("2018-01-12").minusMonths(2).minusDays(1));

        System.out.println(LocalDate.parse("2018-01-10").minusMonths(2).withDayOfMonth(1));

        System.out.println(LocalDate.parse("2016-11-01").plusYears(1).plusDays(10));

    }
}

