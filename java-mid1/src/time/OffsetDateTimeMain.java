package time;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;

public class OffsetDateTimeMain {

    public static void main(String[] args) {

        OffsetDateTime nowOdt = OffsetDateTime.now();
        System.out.println("nowOdt = " + nowOdt);

        LocalDateTime ldt = LocalDateTime.of(2026, 2, 15, 17, 0, 0);
        System.out.println("ldt = " + ldt);

        OffsetDateTime odt = OffsetDateTime.of(ldt, ZoneOffset.of("+09:00"));
        System.out.println("odt = " + odt);
    }
}
