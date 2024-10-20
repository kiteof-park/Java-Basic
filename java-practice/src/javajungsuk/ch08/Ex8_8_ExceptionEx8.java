package javajungsuk.ch08;

public class Ex8_8_ExceptionEx8 {
    public static void main(String[] args) {
        System.out.println("시작");
        try{
            System.out.println(0/0);       //  ⚠️예외 발생
            System.out.println(4);
        } catch (ArithmeticException ae){  // 발생한 예외 객체와 참조변수(ae)타입과 일치
            ae.printStackTrace();
            System.out.println("getMessage() : " + ae.getMessage());
        }
        System.out.println("끝");
    }
}
