package hon_gong_java.sec03.exma02;

public abstract class Animal {
    public String kind;

    public void breathe(){
        System.out.println("숨을 쉽니다.");
    }

    // 추상 메소드 - { } 중괄호가 없음!
    public abstract void sound();
}
