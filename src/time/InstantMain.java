package time;

import java.time.Instant;
import java.time.ZonedDateTime;

public class InstantMain {
    public static void main(String[] args) {
        //생성
        Instant now = Instant.now(); //UTC 기준
        System.out.println("now = " + now);

        ZonedDateTime zdt = ZonedDateTime.now();
        Instant from = Instant.from(zdt); // 다른 타입의 날짜와 시간을 기준으로 Instant 생성
        System.out.println("from = " + from);

        Instant epochStart = Instant.ofEpochSecond(0);
        System.out.println("epochStart = " + epochStart);

        //계산
        Instant later = epochStart.plusSeconds(3600);
        System.out.println("later = " + later);

        //조회
        long laterEpochSecond = later.getEpochSecond();
        System.out.println("laterEpochSecond = " + laterEpochSecond);
    }
}
