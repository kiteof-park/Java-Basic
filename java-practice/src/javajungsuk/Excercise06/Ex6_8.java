package javajungsuk.Excercise06;

class PlayingCard{
    int kind;
    int num;

    static int width;
    static int height;

    PlayingCard(int kind, int num){
        this.kind = kind;
        this.num = num;
    }
}

public class Ex6_8 {
    public static void main(String[] args) {
        PlayingCard card = new PlayingCard(1,1);
        System.out.println("클래스 변수(static 변수) : " + PlayingCard.width + ", " + PlayingCard.height);
        System.out.println("인스턴스 변수 : " + card.kind + ", " + card.num);
        System.out.println("지역변수 : 생성자의 매개변수 kind, num, 그리고 클래스 내부의 this");
    }
}
