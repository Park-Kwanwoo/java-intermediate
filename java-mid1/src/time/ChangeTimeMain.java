package time;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjusters;

public class ChangeTimeMain {

    public static void main(String[] args) {

        LocalDateTime dt = LocalDateTime.of(2026, 2, 15, 17, 0, 0);
        System.out.println("dt = " + dt);

        LocalDateTime changedDt1 = dt.with(ChronoField.YEAR, 2027);
        System.out.println("changedDt1 = " + changedDt1);

        LocalDateTime changedDt2 = dt.withYear(2027);
        System.out.println("changedDt2 = " + changedDt2);

        // TemporalAdjust 사용
        // 다음주 금요일
        LocalDateTime with1 = dt.with(TemporalAdjusters.next(DayOfWeek.FRIDAY));
        System.out.println("기준 날짜:" + dt);
        System.out.println("다음 금요일: " + with1);

        // 이번 달의 마지막 일요일
        LocalDateTime with2 = dt.with(TemporalAdjusters.lastInMonth(DayOfWeek.SUNDAY));
        System.out.println("같은 달의 마지막 일요일: " + with2);
    }
}
