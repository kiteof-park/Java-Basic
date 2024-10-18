package sec05.chap05.ex02;

public class ToggleButton extends Button {

    private boolean on;

    public ToggleButton(String print, boolean on) {
        // super를 호출, ToggleButton에서 받은 print값을 넣어 생성
        super(print);
        this.on = on;
    }

    @Override
    public void func() {
        super.func(); // 부모 자체를 가르킴, 부모의 func()호출, print값은 토글의 print
        // 토글만의 기능을 추가(재정의)
        this.on = !this.on;
        System.out.println(
                "대문자 입력: " + (this.on ? "ON" : "OFF")
        );


    }
}
