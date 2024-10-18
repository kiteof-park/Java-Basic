package sec03.chap06;

public class Ex03 {
    public static void main(String[] args) {
//        String str = "  \t박의연 최 고 짱짱걸  \n";
//        str = str.trim();
//        System.out.println(str);
//
//        String str1 = "햄버거 먹고싶다";
//
//        char ch1 = str1.charAt(0);
//        char ch2 = str1.charAt(5);
//        char ch3 = "맥도날드".charAt(3);

        String str2 = "얄리 얄리 얄라셩 얄라리 얄라";

        //  💡 indexOf/lastIndexOf : 일치하는 첫/마지막 문자열의 위치
        //  앞에서부터 카운트해서 int로 반환

        //  두 번째 인자 : ~번째 이후/이전부터 셈
        int int1 = str2.indexOf('얄');
        int int2 = str2.indexOf('얄', 4);

        int  int3 = str2.indexOf("얄라");
        int  int4 = str2.lastIndexOf("얄라");
        int  int5 = str2.lastIndexOf("얄라", 12);

        String str3 = "박의연 최고 멋쨍이 짱짱";
        int length = str3.length()-1;
        int int6 = str3.lastIndexOf("짱");
        int int7 = str3.lastIndexOf("짱", 8);


        //  💡 포함되지 않은 문자는 -1 반환
        int int8 = str2.indexOf('욜');
    }
}
