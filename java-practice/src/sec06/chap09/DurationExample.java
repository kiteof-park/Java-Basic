package sec06.chap09;

import java.time.Duration;
import java.time.LocalDateTime;

public class DurationExample {
    public static void main(String[] args) {
        LocalDateTime newYear2025 = LocalDateTime.of(2025, 1, 1, 0, 0);
        LocalDateTime now = LocalDateTime.now();

        //  💡 Duration 클래스 : 두 시간 사이의 간격을 다루는 클래스
        Duration countDown2025 = Duration.between(now, newYear2025);
        long[] countDownUnits = {
                countDown2025.toDays(),
                countDown2025.toHours(),
                countDown2025.toMinutes(),
                countDown2025.toSeconds()
        };

        for(long unit : countDownUnits){
            System.out.println(unit);
        }
    }
}
