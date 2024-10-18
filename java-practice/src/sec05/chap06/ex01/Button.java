package sec05.chap06.ex01;

public class Button {
    protected String print;

    public Button(String print) { this.print = print; }

    public void func() { System.out.println(print + "입력적용"); }
}
