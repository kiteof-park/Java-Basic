package sec05.chap05.ex01;

public class Main {
    public static void main(String[] args) {
        YalcoChickenDT dtstore1 = new YalcoChickenDT(108, "강릉", false);

        // 자식 클래스는 부모 클래스의 메소드 사용 가능
        dtstore1.takeHallOrder();

        dtstore1.takeDTOrder();
        dtstore1.setDriveThruOpen(true);
        dtstore1.takeDTOrder();

    }
}
