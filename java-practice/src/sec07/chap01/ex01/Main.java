package sec07.chap01.ex01;

public class Main {
    public static void main(String[] args) {
        Button button = new Button("엔터", Button.Mode.DARK, 3);

        // println()메소드에 button인스턴스를 그대로 넣어 출력
        System.out.println(button);
    }
}
