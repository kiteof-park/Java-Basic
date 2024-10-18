package hon_gong_java.sec08_1.exam03;


import hon_gong_java.sec08_1.exam01.Audio;
import hon_gong_java.sec08_1.exam01.RemoteControl;
import hon_gong_java.sec08_1.exam01.Television;

// 클래스 선언에서 인터페이스 사용 - 필드, 매개변수, 로컬변수
// RemoteControl 인터페이스 사용
public class MyClass {

    // 필드
    public RemoteControl rc = new Television();

    public MyClass(){

    }

    // 생성자 매개변수
    public MyClass(RemoteControl rc){
        this.rc = rc;
        rc.turnOn();
        rc.setVolume(5);
    }

    // 메소드 로컬변수
    public void methodA(){
        RemoteControl rc = new Audio();
        rc.turnOn();         // Audio의 turnOn
        rc.setVolume(5);    // Audio의 SetVolume
    }

    // 메소드 매개변수
    public void methodB(RemoteControl rc){
        rc.turnOn();
        rc.setVolume(5);
    }
}
