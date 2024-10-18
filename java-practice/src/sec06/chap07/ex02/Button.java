package sec06.chap07.ex02;

public class Button {

    // 클래스 내부에 Enum 정의
    public enum ClickedBy{
        LEFT('좌'), RIGHT('우');

        private char indicator;
        ClickedBy(char indicator){this.indicator = indicator;}
        public char getIndicator(){return indicator;}
    }

    // 클래스 내부에 Record정의
    // Record에서 Interface 구현 ( 클래스 상속은 불가!)
    public record ClickInfo(
            int x, int y, ClickedBy clickedBy
    ) implements InfoPrinter {
        //  💡 클래스 필드(static)를 가질 수 있음 (인스턴스 필드는 불가)
        static String desc = "버튼 클릭 정보";

        //  💡 인스턴스/클래스 메소드를 가질 수 있음

        @Override
        public void printInfo() {
            System.out.printf(
                    "%c 클릭(%d, %d)%n",
                    clickedBy.indicator, x, y
            );
        }
    }

    // Button의 인스턴스 메소드
    public ClickInfo func(int x, int y, ClickedBy clickedBy){
        System.out.println("버튼 동작");
        return new ClickInfo(x,y,clickedBy);
    }
}
