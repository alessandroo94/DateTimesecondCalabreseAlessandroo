package Exercise02;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Test {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now.getDayOfMonth() + " " + now.getMonth() + " " + now.getYear() + " " + now.getHour() + ":" + now.getMinute());

        ZonedDateTime now1 = ZonedDateTime.now();
        System.out.println(now1.format(DateTimeFormatter.ISO_ZONED_DATE_TIME));
    }
}
