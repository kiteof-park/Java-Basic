package sec06.chap09;
import java.time.*;

public class LocalClass {
    public static void main(String[] args) {
        
        // 현재 날짜
        LocalDate today = LocalDate.now();
        System.out.println("today " + today);
        
        // 현재 시간
        LocalTime thisTime = LocalTime.now();
        System.out.println("thisTime "+ thisTime);
        
        // 현재 날짜와 시간
        LocalDateTime now = LocalDateTime.now();
        System.out.println("now " + now);
        
        // 날짜 지정
        LocalDate birthday = LocalDate.of(1996, 5, 19);
        System.out.println("birthday " + birthday);

        // 시간 지정
        LocalTime lunchTime = LocalTime.of(12,30);
        LocalTime lunchTimeDetail = LocalTime.of(12, 30, 0, 0);
        System.out.println("lunchTime " + lunchTime);

        // 날짜와 시간 지정
        LocalDateTime familyDinner = LocalDateTime.of(2024, 12, 31, 18, 00);
        System.out.println("familyDinner "  + familyDinner);



    }
}
