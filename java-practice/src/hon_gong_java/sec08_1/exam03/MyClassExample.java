package hon_gong_java.sec08_1.exam03;

import hon_gong_java.sec08_1.exam01.Audio;
import hon_gong_java.sec08_1.exam01.Television;
import hon_gong_java.sec08_1.exam02.SmartTelevision;

public class MyClassExample {
    public static void main(String[] args) {
        System.out.println("1)-------------------");
        // 인터페이스 - 필드로 사용
        MyClass myClass1 = new MyClass();
        myClass1.rc.turnOn();
        myClass1.rc.setVolume(5);

        System.out.println("2)-------------------");
        // 인터페이스 - 생성자의 매개변수로 사용
        MyClass myClass2 = new MyClass(new Audio());
        MyClass myClass3 = new MyClass(new SmartTelevision());

        System.out.println("3)-------------------");
        // 인터페이스 - 메소드 로컬변수로 사용(Audio 객체가 로컬 변수로 사용)
        MyClass myClass4 = new MyClass();
        myClass4.methodA();

        System.out.println("4)-------------------");
        // 인터페이스 - 메소드 매개변수로 사용
        MyClass myClass5 = new MyClass();
        myClass5.methodB(new Television());

    }
}
