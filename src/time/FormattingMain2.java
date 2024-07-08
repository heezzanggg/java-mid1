package time;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormattingMain2 {
    public static void main(String[] args) {
        //포맷팅 : 날짜,시간 -> 문자
        LocalDateTime now = LocalDateTime.of(2024, 7, 8, 13, 30, 59);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDateTime = now.format(formatter);
        System.out.println("날짜,시간 포맷팅(날짜,시간 -> 문자열): " + formattedDateTime);

        //파싱 : 문자 ->날짜,시간
        String dateTimeString = "2030-01-01 11:30:00";
        LocalDateTime parsedDateTime = LocalDateTime.parse(dateTimeString, formatter);
        System.out.println("문자열 파싱(문자열 -> 날짜,시간): " + parsedDateTime);
    }
}
