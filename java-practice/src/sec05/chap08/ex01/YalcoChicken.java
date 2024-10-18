package sec05.chap08.ex01;

public class YalcoChicken extends YalcoGroup {
    // 클래스 메소드
    public static String getCreed(){
        // %s에 "튀김옷은"이 들어감
        return CREED.formatted("튀김옷은");
    }

    // 클래스 변수
    protected static int lastNo = 0;

    // 생성자
    public YalcoChicken(String name) {
        super(++lastNo, name);
    }


    // 추상 메서드 구현
    @Override
    public void takeOrder() {
        System.out.printf("얄코치킨 %s 치킨을 주문해주세요.%n", super.intro());
    }
}
