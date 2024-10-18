package sec05.chap05.ex02;

public class ShutDownButton extends Button {

    // super(): 부모 클래스의 생성자 호출
    // "ShutDown" : 부모 클래스 생성자 Button()의 print값을 설정
    // ShutDown() 생성자를 인자 없이 호출
    // ShutDown() 생성자 내부에서 부모를 호출하면서 print값을 셧다운으로 가지고 있는 버튼 생성
    public ShutDownButton() {
        super("ShutDown");
    }

    @Override
    public void func() {
        System.out.println("프로그램 종료");
    }
}

    
