package sec06.chap06.ex01;

public class Main {
    public static void main(String[] args) {
        Button button1 = new Button();

        button1.setButtonMode(ButtonMode.DARK);
        button1.setButtonSpace(ButtonSpace.TRIPLE);

        ButtonMode button1Mode = button1.getButtonMode();
        ButtonSpace button1Space = button1.getButtonSpace();

        System.out.println(button1Mode);
        System.out.println(button1Space);



    }
}
