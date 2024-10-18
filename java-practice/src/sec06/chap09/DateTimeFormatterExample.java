package sec06.chap09;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateTimeFormatterExample {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();

        // ⭐️시간 표기 형식 지정하기
        // DateTimeFormatter의 ofPattern 메소드 사용

        // 사용자 임의대로 시간 표기 형식 만들기
        DateTimeFormatter formatter1 =
                DateTimeFormatter.ofPattern("1. yyyy-MM-dd");

        DateTimeFormatter formatter2 =
                DateTimeFormatter.ofPattern("2. yyyy/MM/dd HH:mm:ss");

        DateTimeFormatter formatter3 =
                DateTimeFormatter.ofPattern("3. yy.MM.dd");

        DateTimeFormatter formatter4 =
                DateTimeFormatter.ofPattern("4. dd/MM/yyyy hh a");

        DateTimeFormatter formatter5 =
                DateTimeFormatter.ofPattern("5. yyyy년 MM월 dd분 HH시");

        //  DateTimeFormatter 클래스의 코드에서 각 형식 요소 확인
        for(DateTimeFormatter formatter : new DateTimeFormatter[]{
                formatter1, formatter2, formatter3, formatter4, formatter5
        }){
            // 형식에 따라 시간을 문자열로
            System.out.println(now.format(formatter));
        }

        // 문자열에서 LocalDate 인스턴스로 변환

        // 1. 문자열 정의
        String christmas2024str = "2024-12-24";
        // 2. 포맷터 정의 - 날짜 형식 지정
        DateTimeFormatter formatterA =
                DateTimeFormatter.ofPattern("yyyy-MM-dd");

        // ⚠️ 시간 정보는 없으므로 LocalDateTime으로 하면 오류 발생
        // 3. LocalDate로 파싱
        LocalDate christmas2024 =
                LocalDate.parse(christmas2024str, formatterA);

        String newYear2025str = "2025/01/01 00:00:00";
        DateTimeFormatter formatterB =
                DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime newYear =
                LocalDateTime.parse(newYear2025str, formatterB);

    }
}
