package javajungsuk.Excercise07;

class Outer{
    class Inner{
        int iv = 100;

        // 7-27
        int value = 20;
        void method1(){
            int value = 30;

            System.out.println();
            System.out.println();
            System.out.println();
        }
    }

    static class StaticInner{
        int iv = 200;
    }
}

public class Ex7_25 {
    public static void main(String[] args) {
        // Outer의 내부 클래스  Inner의 멤버변수 iv 출력
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        System.out.println("Inner클래스의 멤버변수 iv: " + inner.iv);

        Outer.StaticInner staticInner = new Outer.StaticInner();
        System.out.println("StaticInner클래스의 멤버변수 iv: " + staticInner.iv);


    }
}
