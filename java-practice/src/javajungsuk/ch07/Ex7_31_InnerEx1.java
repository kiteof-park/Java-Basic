package javajungsuk.ch07;

public class Ex7_31_InnerEx1 {

    // 인스턴스 내부 클래스
    class InstanceInner{
        int iv = 100;
        // static int cv = 100;
        final static int CONST =100;
    }
    
    // static 내부 클래스
    static class StaticInner{
        int iv = 200;
        static int cv =200;
    }

    void myMethod(){
        // 지역 내부 클래스
        class LocalInner{
            int iv = 300;
            // static int cv = 300;
            final static int CONST = 300;
        }
    }

    public static void main(String[] args) {
        System.out.println(InstanceInner.CONST);
        System.out.println(StaticInner.cv);
    }
}
