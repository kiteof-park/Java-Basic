package javajungsuk.ch06;

public class Ex6_8_CallStackTest {
    public static void main(String[] args) {
        System.out.println("main()시작");
        firstMethod();
        System.out.println("main()끝");

    }

    static void firstMethod(){
        System.out.println("firstMethod()시작");
        secondMethod();
        System.out.println("firstMethod()끝");
    }

    static void secondMethod(){
        System.out.println("secondMethod()시작");
        System.out.println("secondMethod()끝");
    }
}
