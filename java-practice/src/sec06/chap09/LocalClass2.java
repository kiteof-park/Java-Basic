package sec06.chap09;

import java.time.*;

public class LocalClass2 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate tomorrow = today.plusDays(1);
        LocalDate yesterday = today.minusDays(1);

        for(LocalDate day : new LocalDate[]{today, tomorrow, yesterday}){
            System.out.println(day);
        }

        LocalDate threeMonthsLater = today.plusMonths(3);
        LocalDate tenYearsBefore = today.minusYears(10);

        // 메소드 체이닝 사용
        LocalTime thisTime = LocalTime.now();
        LocalTime hoursAndHalfLater = thisTime
                .plusHours(1)
                .plusMinutes(30);

        LocalDateTime now = LocalDateTime.now();
        LocalDateTime randomPast = now
                .minusYears(1)
                .plusMonths(2)
                .minusDays(3)
                .plusHours(4)
                .minusMinutes(5)
                .plusSeconds(6)
                .minusNanos(7);




    }
}
