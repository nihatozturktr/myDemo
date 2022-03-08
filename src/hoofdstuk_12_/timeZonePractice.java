package hoofdstuk_12_;

import java.time.*;

public class timeZonePractice {
    public static void main(String[] args) {

        ZoneId zoneId = ZoneId.of("Europe/London");
        ZonedDateTime nowLondon=ZonedDateTime.now(zoneId);

        System.out.println(zoneId+ " s time is "+ nowLondon);
         ZoneId zoneId2 =ZoneId.of("Australia/Sydney");
         ZonedDateTime nowSydney=  ZonedDateTime.now(zoneId2);
        System.out.println(zoneId2+ " s time is "+ nowSydney);

        ZoneId zoneId4 = ZoneId.of("Australia/Adelaide");
        ZonedDateTime nowAdelaide = ZonedDateTime.now(zoneId4);
        System.out.println(zoneId4+ " s time is "+ nowAdelaide);



        ZoneId zoneId3 = ZoneId.of("UTC-4");
        ZonedDateTime nowUTC4= ZonedDateTime.now(zoneId3);
        System.out.println(zoneId3+ " s time is "+ nowUTC4);



    }
}
