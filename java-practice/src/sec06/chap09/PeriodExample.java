package sec06.chap09;

import java.time.*;

public class PeriodExample {
    public static void main(String[] args) {
        LocalDate eyBirthday = LocalDate.of(1996, 5, 19);
        LocalDate jyBirthday = LocalDate.of(1993, 3, 9);

        Period birthday = Period.between(jyBirthday, eyBirthday);
        int[] birthdayUnits = {
                birthday.getYears(),
                birthday.getMonths(),
                birthday.getDays()
        };

        for(int unit : birthdayUnits){
            System.out.println(unit);
        }

    }
}
