package time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeMain {
    public static void main(String[] args) {
        LocalDateTime nowDt = LocalDateTime.now();
        LocalDateTime ofDt = LocalDateTime.of(2023, 10, 9, 8, 10, 1);
        System.out.println("오늘 날짜 = " + nowDt);
        System.out.println("지정 날짜 = " + ofDt);
        //날짜와 시간 분리
        LocalDate localDate = ofDt.toLocalDate();
        LocalTime localTime = ofDt.toLocalTime();
        System.out.println("localDate = " + localDate);
        System.out.println("localTime = " + localTime);
        //날짜와 시간 합체
        LocalDateTime localDateTime = LocalDateTime.of(localDate, localTime);
        System.out.println("localDateTime = " + localDateTime);
        //계산(불변)
        LocalDateTime ofDtPlus = ofDt.plusDays(300);
        System.out.println("지정 날짜+300d  = " + ofDtPlus);
        LocalDateTime ofDtPlus1Year = ofDt.plusYears(1);
        System.out.println("지정 날짜+1Y = " + ofDtPlus1Year);
        //비교
        System.out.println("현재 날짜시간이 지정 날짜시간보다 이전? " + nowDt.isBefore(ofDt)); // false
        System.out.println("현재 날짜시간이 지정 날싸시간보다 이후? " + nowDt.isAfter(ofDt)); //true
        System.out.println("현재 날짜시간과 지정 날짜시간 같은가? " + nowDt.isEqual(ofDt)); //false
    }
}
