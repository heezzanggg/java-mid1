package time.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class TestCalendarPrinter {
    public static void main(String[] args) {
        //입력조건 : 년도, 월
        //실행시 날짜의 간격에는 신경 x

        Scanner sc = new Scanner(System.in);
        System.out.print("년도를 입력하세요: ");
        int inputYear = sc.nextInt();
        System.out.print("월을 입력하세요: ");
        int inputMonth = sc.nextInt();

        printCalendar(inputYear,inputMonth);
//        printCalendar(2024,1);

    }

    private static void printCalendar(int year, int month){
        LocalDate firstDayOfMonth = LocalDate.of(year, month, 1);
        LocalDate firstDayOfNextMonth = firstDayOfMonth.plusMonths(1);

        //Mo 1 ,Tu 2 .... Su 7 -> 나머지 Su 0, Mo 1, Tu 2,.... Sa 6
        int offsetWeekDays = firstDayOfMonth.getDayOfWeek().getValue() % 7;

        System.out.println("Su Mo Tu We Th Fr Sa");

        for(int i = 0; i<offsetWeekDays; i++){
            System.out.print("   ");
        }
        LocalDate dayIterator = firstDayOfMonth;
        while (dayIterator.isBefore(firstDayOfNextMonth)){
            System.out.printf("%2d ",dayIterator.getDayOfMonth());
            if(dayIterator.getDayOfWeek() == DayOfWeek.SATURDAY){
                System.out.println();
            }
            dayIterator = dayIterator.plusDays(1);
        }
    }
}
