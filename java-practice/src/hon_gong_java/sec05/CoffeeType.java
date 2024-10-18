package hon_gong_java.sec05;

public enum CoffeeType {
    ESSPRESSO(30, "Strong"),
    AMERICANO(120, "Mild"),
    LATTE(150, "Creamy");

    // 필드: 각 커피 타입의 카페인 양과 맛
    private int caffeine;
    private String flavor;

    // 생성자: 필드를 초기화하는 생성자
    CoffeeType(int caffeine, String flavor){
        this.caffeine = caffeine;
        this.flavor = flavor;
    }

    // 메소드: 각 커피 타입의 정보를 반환하는 메소드
    public int getCaffeine(){
        return caffeine;
    }

    public String getFlavor(){
        return flavor;
    }
}
