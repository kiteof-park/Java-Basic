package sec05.chap06.ex01;

public class Main {
    public static void main(String[] args) {
        //  💡 가능 - 자식 클래스는 부모 클래스에 속함
        Button button1 = new Button("Enter");
        Button button2 = new ShutDownButton();
        Button button3 = new ToggleButton("CapsLock", true);

        //  ⚠️ 불가
//        ShutDownButton button4 = new Button("Enter");
//        ToggleButton button5 = new ShutDownButton();

        // 다형성
        Button[] btnAry1 = {button1, button2, button3};

        for (Button btn: btnAry1) {
            btn.func();
        }

        Button button = new Button("버튼");
        ToggleButton toggleButton = new ToggleButton("토글", true);
        ShutDownButton shutDownButton = new ShutDownButton();

        //  true
        boolean typeCheck1 = button instanceof Button;
        boolean typeCheck2 = toggleButton instanceof Button;
        boolean typeCheck3 = shutDownButton instanceof Button;

        //  false
        boolean typeCheck4 = button instanceof ShutDownButton;
        boolean typeCheck5 = button instanceof ToggleButton;

        //  ⚠️ 컴파일 에러
//        boolean typeCheck6 = toggleButton instanceof ShutDownButton;
//        boolean typeCheck7 = shutDownButton instanceof ToggleButton;

        Button[] btnAry2 = {
                new Button("Space"),
                new ToggleButton("NumLock", false),
                new ShutDownButton()
        };

        for (Button btn : btnAry2) {
            if(btn instanceof ShutDownButton) continue;
            btn.func();
        }

    }
}
