package sec06.chap04.ex02;

public class Main {
    public static void main(String[] args) {

        Button button1 = new Button("Enter");
        Button button2 = new Button("CapsLock");
        Button button3 = new Button("ShutDown");

        // 익명 클래스는 OnClickLister 인터페이스를 구현(implements)한 클래스와 같음
        button1.setOnClickListner(new OnClickListner() {
            @Override
            public void onClick() {
                System.out.println("줄바꿈");
                System.out.println("커서를 다음 줄에 위치");
            }
        });
        
        button2.setOnClickListner(new OnClickListner() {
            @Override
            public void onClick() {
                System.out.println("기본입력 대소문자 전환");
            }
        });

        button3.setOnClickListner(new OnClickListner() {
            @Override
            public void onClick() {
                System.out.println("작업 자동 저장");
                System.out.println("프로그램 종류");
            }
        });

        for(Button button : new Button[]{button1, button2, button3}){
            button.func();
        }
    }
}
