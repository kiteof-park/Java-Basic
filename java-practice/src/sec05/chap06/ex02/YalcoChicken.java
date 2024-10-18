package sec05.chap06.ex02;

public class YalcoChicken {
    // 접근제어자 protected -> 다른 패키지/자식 클래스
    protected int no;
    protected String name;

    public YalcoChicken(int no, String name) {
        this.no = no;
        this.name = name;
    }

    public void takeHallOrder() {
        System.out.printf("%d호 %s점 홀 주문 받음%n", no, name);
    }
}
