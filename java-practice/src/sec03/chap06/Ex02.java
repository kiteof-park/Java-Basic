package sec03.chap06;

public class Ex02 {
    public static void main(String[] args) {
        String str1 = "";
        String str2 = " \t\n";

        int int1 = str1.length();
        int int2 = str2.length();

        //  💡isEmpty : 문자열의 길이가 0인지 여부
        boolean bool1 = str1.isEmpty();
        boolean bool2 = str2.isEmpty();

        //  💡isBlank : 공백(white space)을 제외한 문자열의 길이가 0인지 여부
        boolean bool3 = str1.isBlank();
        boolean bool4 = str2.isBlank();

    }
}
