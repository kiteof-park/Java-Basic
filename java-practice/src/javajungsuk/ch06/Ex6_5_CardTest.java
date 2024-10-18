package javajungsuk.ch06;

class Card{
    String kind;
    int number;

    static int width = 100;
    static int height = 250;
}

public class Ex6_5_CardTest {
    public static void main(String[] args) {
        System.out.println("Card.width : " + Card.width);
        System.out.println("Card.height : " + Card.height);

        Card c1 = new Card();
        c1.kind = "heart";
        c1.number = 7;

        Card c2 = new Card();
        c2.kind = "Spade";
        c2.number = 4;

        
        System.out.println("c1크기 :" + c1.width +", " + c1.height);
        System.out.println("c2크기 :" + c2.width +", " + c2.height);

        System.out.println("c1의 크기 변경");
        
        // 참조변수로 static 멤버에 접근하는 것을 지양한다 -> 클래스 변수와 인스턴스 변수 혼동
        c1.width = 200;
        c1.height = 500;

        System.out.println("c1크기 :" + c1.width +", " + c1.height);
        System.out.println("c2크기 :" + c2.width +", " + c2.height);

    }
}
