package sec05.chap03.ex01;

public class YalcoChicken {
    // static field
    static String brand = "얄코치킨";
    // static method
    static String contact() {
        return "%s입니다. 무엇을 도와드릴까요?".formatted(brand);
    }

    // 인스턴스 필드
    int no;
    String name;

    // 생성자
    YalcoChicken(int no, String name){
        this.no = no;
        this.name = name;
    }

    String intro(){
        //  💡 인스턴스 메소드에서는 정적 프로퍼티 사용 가능
        return "안녕하세요 %s %d호 %s점입니다. %n"
                .formatted(brand, no, name);
    }
}
