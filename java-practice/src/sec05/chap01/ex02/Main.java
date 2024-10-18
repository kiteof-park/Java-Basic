package sec05.chap01.ex02;

public class Main {
    public static void main(String[] args) {

        // 정의한 클래스를 main에서 인스턴스로 만들어 사용
        YalcoChicken store1 = new YalcoChicken();
        store1.no = 3;
        store1.name = "강남";
        System.out.println(store1.intro());

        YalcoChicken store2 = new YalcoChicken();
        store2.no = 5;
        store2.name = "판교";
        System.out.println(store2.intro());





    }
}
