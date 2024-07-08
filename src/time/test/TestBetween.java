package time.test;

import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class TestBetween {
    public static void main(String[] args) {
        //시작날짜, 목표 날짜 입력해서 남은 기간과 디데이 구하기
        //남은 기간 : x년 x개월 x일 형식으로 출력
        //디데이 :  x일 남은 형식으로 출력

        LocalDate startDt = LocalDate.of(2024,1,1);
        LocalDate endDt = LocalDate.of(2024,11,21);

        Period period = Period.between(startDt, endDt);
        long daysBetween = ChronoUnit.DAYS.between(startDt, endDt);

        System.out.println("시작 날짜: " + startDt);
        System.out.println("목표 날짜: " + endDt);
        System.out.println("남은 기간:" + period.getYears() + "년 " + period.getMonths() + "개월 " + period.getDays() + "일 ");
        System.out.println("디데이:" + daysBetween + "일 남음");
    }
}
