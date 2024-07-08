package time.test;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class TestZone {
    public static void main(String[] args) {
        //서울 회의시간 2024년 1월 1일 오전 9시 => 런던,뉴욕 회의 시간 구하기

        for (String zone : ZoneId.getAvailableZoneIds()) {
            System.out.println(zone);
        }
        LocalDateTime seoulTimeZone = LocalDateTime.of(2024, 1, 1, 9, 0, 9);
        ZonedDateTime seoulTime = ZonedDateTime.of(seoulTimeZone, ZoneId.of("Asia/Seoul"));
        ZonedDateTime londonTime = seoulTime.withZoneSameInstant(ZoneId.of("Europe/London"));
        ZonedDateTime nyTime = seoulTime.withZoneSameInstant(ZoneId.of("America/New_York"));

        System.out.println("서울의 회의 시간: " + seoulTime);
        System.out.println("런던의 회의 시간: " + londonTime);
        System.out.println("뉴욕의 회의 시간: " + nyTime);
    }
}
