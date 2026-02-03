package time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeMain {

    public static void main(String[] args) {

        LocalDateTime nowDt = LocalDateTime.now();
        LocalDateTime ofDt = LocalDateTime.of(2026, 2, 15, 17, 0, 0);

        System.out.println("현재 날짜시간:" + nowDt);
        System.out.println("지정 날짜시간:" + ofDt);


        // 날짜와 시간 분리
        LocalDate localDate = ofDt.toLocalDate();
        LocalTime localTime = ofDt.toLocalTime();
        System.out.println("localDate = " + localDate);
        System.out.println("localTime = " + localTime);

        // 날짜 시간 결합
        LocalDateTime localDateTime = LocalDateTime.of(localDate, localTime);
        System.out.println("localDateTime = " + localDateTime);

        // 계산(불변)
        LocalDateTime ofDtPlus = ofDt.plusDays(1000);
        System.out.println("지정 날짜시간(+1000d): " + ofDtPlus);
        LocalDateTime ofDtPlus1Year = ofDtPlus.plusYears(1);
        System.out.println("지정 날짜시간(+1y): " + ofDtPlus1Year);

        // 비교
        System.out.println("현재 날짜 시간이 지정 날짜 시간보다 이전인가? " + nowDt.isBefore(ofDtPlus));
        System.out.println("현재 날짜 시간이 지정 날짜 시간보다 이후인가? " + nowDt.isAfter(ofDtPlus));
    }
}
