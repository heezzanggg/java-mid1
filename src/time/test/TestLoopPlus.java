package time.test;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class TestLoopPlus {
    public static void main(String[] args) {
        //날짜 간격 반복 출력
        //2024년 1월 1일 부터 2주간격으로 5번 반복하여 날짜 출력하는 코드 작성
        LocalDate startDate = LocalDate.of(2024, 1, 1);

        for (int i = 0; i < 5; i++) {
//            LocalDate nextDate = startDate.plusDays(14 * i);
            LocalDate nextDate = startDate.plus(2*i, ChronoUnit.WEEKS);

            System.out.println("날짜 " + (i + 1) + ": " + nextDate);

        }
    }
}
