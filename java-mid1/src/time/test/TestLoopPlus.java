package time.test;

import java.time.LocalDate;
import java.time.Period;

public class TestLoopPlus {

    public static void main(String[] args) {

        // Q. 2024년 1월 1일부터 2주 간격으로 5번 반복하여 날짜를 출력하는 코드를 작성하라
        LocalDate ld = LocalDate.of(2024, 1, 1);
        Period period = Period.ofDays(14);

        for (int i = 0; i < 5; i++) {
            System.out.println("result = " + ld);
            ld = ld.plus(period);
        }
    }
}
