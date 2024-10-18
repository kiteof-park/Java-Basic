package sec05.chap08.ex01;

// 추상 클래스
public abstract class YalcoGroup {
    // 추상 클래스의 필드
    protected static final String CREED = "우리의 %s는 얄팍하다";

    protected final int no;
    protected final String name;

    public YalcoGroup(int no, String name) {
        this.no = no;
        this.name = name;
    }

    // 추상 클래스의 메서드, intro()는 추상 메서드가 아님!
    public String intro(){
        return "%d호 %s점입니다.".formatted(no, name);
    }

    // 추상 메서드
    // 추상 메서드는 자식 클래스에서 구현을 강제하므로 접근 제어자가 의미없음
    public abstract void takeOrder();

}
