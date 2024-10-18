package sec07.chap02;

public class Ex03 {
    public static void main(String[] args) {

        Integer int1 = Integer.valueOf("123");
        int int2 = Integer.parseInt("123");

        int int_123_oct = Integer.parseInt("123", 8);
        int int_123_dec = Integer.parseInt("123", 10);
        int int_123_hex = Integer.parseInt("123", 16);

        int int3 = Integer.parseInt("1234567", 3, 5, 10);


        String strSample = "Ab가1 .";
        for(int i = 0; i < strSample.length(); i++){
            Character c = strSample.charAt(i);
            System.out.printf(
                    "[%c] : Letter: %b, Upper: %b, Lower: %b, Digit: %b, SpaceChar: %b%n",
                    c,
                    Character.isLetter(c),
                    Character.isUpperCase(c),
                    Character.isLowerCase(c),
                    Character.isDigit(c),
                    Character.isSpaceChar(c)
            );
        }




    }
}
