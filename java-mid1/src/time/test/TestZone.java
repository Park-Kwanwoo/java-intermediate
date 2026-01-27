package time.test;

import java.time.*;

public class TestZone {

    public static void main(String[] args) {

        // Q. 서울의 회의 시간은 2024년 1월 1일 오전 9시다. 이때 런던, 뉴욕의 회의 시간을 구하라
        LocalDate koreaDate = LocalDate.of(2024, 1, 1);
        LocalTime koreaTime = LocalTime.of(9, 0);
        ZonedDateTime korea = ZonedDateTime.of(koreaDate, koreaTime, ZoneId.of("Asia/Seoul"));
        ZonedDateTime london = ZonedDateTime.of(koreaDate, koreaTime, ZoneId.of("Europe/London"));
        ZonedDateTime new_york = ZonedDateTime.of(koreaDate, koreaTime, ZoneId.of("America/New_York"));
        System.out.println("서울의 회의 시간:" + korea);
        System.out.println("런던의 회의 시간:" + london);
        System.out.println("뉴욕의 회의 시간:" + new_york);


    }
}
