package sec03.chap05;

public class Ex02 {
    public static void main(String[] args) {
//        String str1 = "안녕";
//
//        boolean bool1 = str1.equals("안녕"); // true
//
//        boolean bool2 = "안녕".equals("안녕");
//        boolean bool3 = "안녕".equals(str1);

        String str1 = "Hello";
        String str2 =  "World";
        String str3 = str1 + str2;

        String str4 = "박의연";
        str4 += "짱이다"; // str4: 박의연 짱이다

        String str5 = str4 +="최고다"; // str4, str5: 박의연 짱이다 최고다

        boolean bool1 = str4.equals(str5);


    }
}
