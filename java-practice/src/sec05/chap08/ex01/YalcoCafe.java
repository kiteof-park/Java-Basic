package sec05.chap08.ex01;

public class YalcoCafe extends YalcoGroup {
    // 클래스 메소드
    public static String getCreed(){
        return CREED.formatted("원두향은");
    }

    protected static int lastNo = 0;
    private  boolean isTakeOut;

    public YalcoCafe(String name, boolean isTakeOut) {
        super(++lastNo, name);
        this.isTakeOut = isTakeOut;
    }

    @Override
    public void takeOrder() {
        System.out.printf("알코카페 %s 음료를 주문해주세요.%n", super.intro());
        if(!isTakeOut) System.out.println("매장에서 드시겠어요?");
    }
}
