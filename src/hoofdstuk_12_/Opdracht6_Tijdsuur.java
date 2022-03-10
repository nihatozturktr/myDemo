package hoofdstuk_12_;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Opdracht6_Tijdsuur {

    public static void main(String[] args) {


        Instant now = Instant.now();
        Instant later = now.plusSeconds(500)
                .plusMillis(2125698)
                .plusNanos(456398);

        Duration duration = Duration.between(now, later);
        System.out.println(duration.getSeconds());

        long milliseconds = ChronoUnit.MILLIS.between(now, later);
        System.out.println(milliseconds);

        LocalDate nowDate = LocalDate.now();
        LocalDate thenDate = LocalDate.of(1986 , 06, 15);

        Period period = Period.between(nowDate, thenDate);
        System.out.println("Period: " + period);
        System.out.println("Years: " + period.getYears());
        System.out.println("Months: " + period.getMonths());
        System.out.println("Days: " + period.getDays());

        long months = ChronoUnit.MONTHS.between(nowDate, thenDate);
        long weeks = ChronoUnit.WEEKS.between(nowDate, thenDate);
        long days = ChronoUnit.DAYS.between(nowDate, thenDate);
        long days2 = ChronoUnit.DAYS.between(thenDate,nowDate);
        System.out.println(days);
        System.out.println(weeks);
        System.out.println(months);
        System.out.println(days2);

    }
}
