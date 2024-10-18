package sec05.chap08.ex02;

public class Button extends FormElement {
    private String print;

    public Button(int space, String print) {
        super(space);
        this.print = print;
    }

    // override한 메서드에 접근 제어자는 왜 안붙을까?
    @Override
    void func() {
        System.out.println(print + "입력 적용");
    }
}
