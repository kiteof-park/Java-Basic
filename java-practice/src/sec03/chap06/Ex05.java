package sec03.chap06;

public class Ex05 {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "DEF";

        int int1 = str1.compareTo(str2);

        //  💡 compareToIgnoreCase : 대소문자 구분 없이 비교
        int int2 = str1.compareToIgnoreCase(str2);
    }
}
