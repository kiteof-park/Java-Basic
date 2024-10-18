package sec03.chap03;

public class Ex01 {
    public static void main(String[] args) {
        char ch1 = 'A';
        char ch2 = 'a';
        char ch3 = 'a'+1;
        char ch4 = '가';
        char ch5 = '가'+1;

        int ch1Int = (int) ch1;
        int ch5Int = (int) ch5;

        // 리터럴 + 정수 -> char 가능
        char charRes1 = 'A'+1;

        // 리터럴 + 정수 -> int 가능
        int intRes1 = 'A'+1;

        // 변수 + 정수 -> char 불가
//        char charRes2 = ch1 + 1;

        // 변수 + 정수 -> int 가능
        int intRes2 = ch1+1;

//        //  💡 int 1과 char '1'은 다름! - 문자로서의 '1'
//        //  - 해당 문자의 정수값 확인
//        char ch_b1 = 'A';
//        char ch_b2 = 'B';
//
//        //  ⚠️ 숫자 문자에 사칙연산 - 문자 번호 기준 결과 반환
//        char ch_b3 = (char)(ch_b1 + ch_b2);
//        System.out.println(ch_b3);

        //  💡 int 1과 char '1'은 다름! - 문자로서의 '1'
        //  - 해당 문자의 정수값 확인
        char ch_b1 = '1';
        char ch_b2 = '2';

        //  ⚠️ 숫자 문자에 사칙연산 - 문자 번호 기준 결과 반환
        char ch_b3 = '1' + '2';
        int int_b4 = ch_b1 + ch_b2;

        //  💡 아래의 기능으로 문자가 의미하는 정수로 변환
        int int_d1 = Character.getNumericValue('1');
        int int_d2 = Character.getNumericValue('B');

//        char empty='';
        String empty="";
        char space=' ';

    }
}
