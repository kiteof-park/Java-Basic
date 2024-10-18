package sec05.chap07;

public class Main {
    public static void main(String[] args) {
        String ycCreed = YalcoChicken.CREED;
//        YalcoChicken.CREED = "우리의 튀김옷은 바삭하다"; // ⚠️ 불가

        // 인스턴스를 담는 변수 store1을 final로 지정
        final YalcoChicken store1 = new YalcoChicken(3, "판교");

        //  ⚠️ 불가 -> store1은  final로 선언됨
//        store1 = new YalcoChicken(17, "강남");
        //  💡 요소 변경은 가능
        store1.name = "선릉";

    }
}
