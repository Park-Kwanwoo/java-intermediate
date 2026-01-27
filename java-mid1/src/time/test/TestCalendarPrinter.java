package time.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class TestCalendarPrinter {

    public static void main(String[] args) {

        // Q. 달력을 출력하라.

        Scanner scanner = new Scanner(System.in);
        System.out.print("년도를 입력하세요: ");
        int year = scanner.nextInt();
        System.out.print("월을 입력하세요: ");
        int month = scanner.nextInt();
        printCalendar(year, month);
    }

//    private static void printCalendar(int year, int month) {
//
//        LocalDate date = LocalDate.of(year, month, 1);
//        int whiteSpace = date.getDayOfWeek().getValue() % 7;
//
//        LocalDate with = date.with(TemporalAdjusters.lastDayOfMonth());
//        int lastDayOfMonth = with.getDayOfMonth();
//
//        System.out.println("Su Mo Tu We Th Fr Sa ");
//
//        for (int i = 0; i <= whiteSpace; i++) {
//            System.out.print("  ");
//        }
//
//        LocalDate idx = date;
//        for (int i = 1; i <= lastDayOfMonth;
//             i++) {
//            System.out.printf("%2d ", i);
//            if (idx.getDayOfWeek().equals(DayOfWeek.SATURDAY)) System.out.println();
//            idx = idx.plusDays(1);
//        }
//    }

    public static void printCalendar(int year, int month) {

        LocalDate date = LocalDate.of(year, month, 1);
        LocalDate nextMonth = date.plusMonths(1);
        int whiteSpace = date.getDayOfWeek().getValue() % 7;

        System.out.println("Su Mo Tu We Th Fr Sa ");

        for (int i = 0; i <= whiteSpace; i++) {
            System.out.print("  ");
        }

        LocalDate dayIterator = date;
        while (dayIterator.isBefore(nextMonth)) {
            System.out.printf("%2d ", dayIterator.getDayOfMonth());
            if (dayIterator.getDayOfWeek().equals(DayOfWeek.SATURDAY)) System.out.println();
            dayIterator = dayIterator.plusDays(1);
        }
    }
}
