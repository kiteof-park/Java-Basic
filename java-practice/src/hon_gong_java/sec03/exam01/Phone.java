package hon_gong_java.sec03.exam01;

// 추상 클래스 - 필드, 생성자, 메소드를 가질 수 있다.
public abstract class Phone {
    // 필드
    public String owner;

    // 생성자
    public Phone(String owner){
        this.owner = owner;
    }
    // 메소드
    public void turnOn(){
        System.out.println("전원을 켭니다.");
    }

    public void turnOff(){
        System.out.println("전원을 끕니다.");
    }

}
