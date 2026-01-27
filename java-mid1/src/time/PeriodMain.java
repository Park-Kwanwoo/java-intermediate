package time;

import java.time.LocalDate;
import java.time.Period;

public class PeriodMain {

    public static void main(String[] args) {

        // 생성
        Period period = Period.ofDays(10);
        System.out.println("period = " + period);

        // 계산에 사용
        LocalDate date = LocalDate.of(2026, 2, 15);
        LocalDate plusDate = date.plus(period);
        System.out.println("현재 날짜 = " + date);
        System.out.println("더한 날짜 = " + plusDate);

        // 기간 차이
        LocalDate currentDate = LocalDate.of(2026, 1, 27);
        LocalDate movingDate = LocalDate.of(2026, 2, 15);
        Period between = Period.between(currentDate, movingDate );
        System.out.println("기간: " + between.getMonths() + "개월 " + between.getDays() + "일");
    }
}
