package javajungsuk.ch08;

public class Ex8_12_ExceptionEx {
    // 예외 선언 -> main()을 호출한 곳(JVM)으로 예외 처리 위임
    public static void main(String[] args) throws Exception{
        method1();
    }

    // 예외 선언 -> method1()을 호출한 곳으로 예외 처리 위임
    static void method1() throws Exception{
        method2();
    }

    // 예외 선언 -> method2()를 호출한 곳으로 예외 처리 위임
    static void method2() throws Exception{
        throw new Exception("예외 발생");
    }
}
