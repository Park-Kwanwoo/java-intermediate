package time;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZoneDateTimeMain {

    public static void main(String[] args) {

        ZonedDateTime nowZdt = ZonedDateTime.now();
        System.out.println("nowZdt = " + nowZdt);

        LocalDateTime ldt = LocalDateTime.of(2026, 2, 15, 17, 0, 0);
        ZonedDateTime zdt1 = ZonedDateTime.of(ldt, ZoneId.of("Asia/Seoul"));
        System.out.println("zdt1 = " + zdt1);

        ZonedDateTime zdt2 = ZonedDateTime.of(2026, 2, 15, 17, 0, 0, 0, ZoneId.of("Asia/Seoul"));
        System.out.println("zdt2 = " + zdt2);

        ZonedDateTime utdZdt = zdt2.withZoneSameInstant(ZoneId.of("UTC"));
        System.out.println("utdZdt = " + utdZdt);
    }
}
