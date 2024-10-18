package hon_gong_java.sec08_1.exam01;

public interface RemoteControl {
    
    // 상수 필드 - public static final 생략 가능
    int MAX_VOLUME = 10;
    int MIN_VOLUME = 0;

    // 추상 메소드 - public abstract 생략 가능
    void turnOn();
    void turOff();
    void setVolume(int volume);
}
