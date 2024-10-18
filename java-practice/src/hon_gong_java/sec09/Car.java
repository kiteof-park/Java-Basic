package hon_gong_java.sec09;

public class Car {
    class Tire{
        Tire(){
            System.out.println("인스턴스 멤버 클래스 Tire 객체 생성");
        }
    }
    static class Engine{
        Engine(){
            System.out.println("정적 멤버 클래스 Engine 객체 생성");
        }
    }
}
