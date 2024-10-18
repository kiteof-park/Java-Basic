package sec05.chap06.ex02;

public class Main {
    public static void main(String[] args) {
        YalcoChickenDT dtstore1 = new YalcoChickenDT(108, "강릉", false);

        // 자식 클래스는 부모 클래스의 메소드 사용 가능
        dtstore1.takeHallOrder();

        dtstore1.takeDTOrder();
        dtstore1.setDriveThruOpen(true);
        dtstore1.takeDTOrder();

        System.out.println("\n- - - - -\n");

        YalcoChicken ycStores[] = {
                new YalcoChicken(3, "판교"),
                new YalcoChicken(17, "강남"),
                new YalcoChickenDT(108, "철원", false),

        };

        for (YalcoChicken store : ycStores) {
            if (store instanceof YalcoChickenDT) {
                // ⭐️ 자식 클래스의 기능을 사용하려면 명시적 타입 변환
                // store는 모두 YalcoChicken 자료형으로 들어와있음
                ((YalcoChickenDT) store).takeDTOrder();
            } else {
                store.takeHallOrder();
            }
        }

    }
}
