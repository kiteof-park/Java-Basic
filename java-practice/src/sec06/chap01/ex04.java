package sec06.chap01;

public class ex04 {
    // 클래스 메소드 main()
    public static void main(String[] args) {
        new ex04().printKings();

    }

    // 클래스 필드
    String king = "사자";

    void printKings(){
        // 메소드 내에서 선언된 변수
        String king = "여우";

        // 인스턴스의 필드는 다른 영역으로 간주
        System.out.printf("인스턴스의 왕은 %s, 블록의 왕은 %s%n",
                            this.king, king);

    }
}
