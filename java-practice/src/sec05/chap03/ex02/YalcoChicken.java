package sec05.chap03.ex02;

public class YalcoChicken {
    static String brand = "알코치킨";
    static String contact() {
        return "%s입니다. 무엇을 도와드릴까요?".formatted(brand);
    }
    static int lastNo = 0;

    // 인스턴스 필드
    int no;
    String name;

    // 생성자
    YalcoChicken(String name){
        this.no = ++lastNo;
        this.name = name;
    }

    // 인스턴스 메소드
    String intro() {
        return "안녕하세요, %s %d호 %점입니다."
                .formatted(brand, no, name);
    }
}
