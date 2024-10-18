package sec06.chap06.ex01;

public class Button {
    private ButtonMode buttonMode = ButtonMode.LIGHT;
    private ButtonSpace buttonSpace = ButtonSpace.SINGLE;

    public void setButtonMode(ButtonMode buttonMode){
        this.buttonMode = buttonMode;
    }

    public ButtonMode getButtonMode() {
        return buttonMode;
    }

    public void setButtonSpace(ButtonSpace buttonSpace) {
        this.buttonSpace = buttonSpace;
    }

    public ButtonSpace getButtonSpace() {
        return buttonSpace;
    }
}
