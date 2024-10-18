package sec05.chap03.ex03;

public class Main {
    public static void main(String[] args) {
        Button btn1 = new Button('1', 1);
        Button btnPlus = new Button('+', 3);
        Button btnClear = new Button('C', 2);

        Button[] btnAry = {btn1, btnPlus, btnClear};

        System.out.println(Button.mode); // static 필드에 접근
        for(Button btn : btnAry){ btn.place(); }

        Button.switchMode(); // Button.mode가 바뀜
        System.out.println(Button.mode);
        for(Button btn : btnAry){ btn.place(); }
    }
}
