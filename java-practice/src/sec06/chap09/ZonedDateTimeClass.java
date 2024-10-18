package sec06.chap09;

import java.time.*;

public class ZonedDateTimeClass {
    public static void main(String[] args) {
        // ZoneDateTime의 now()는 이 컴퓨터가 따르는 시간대를 기준으로 함
        ZonedDateTime nowHere = ZonedDateTime.now();
        System.out.println(nowHere);                        // +09:00[Asia/Seoul]와 같은 타임존에 대한 추가정보

        // 현재 시간대 구하기
        String hereZone = nowHere.getZone().toString();     // Asia/Seoul
        System.out.println(hereZone);

        // 특정 지역(시간대)의 특정 시간 지정하기
        ZonedDateTime newYork =  ZonedDateTime.of(
                2025, 1, 1,
                0, 0, 0, 0,
                ZoneId.of("America/New_York"));

        System.out.println(newYork);



    }
}
