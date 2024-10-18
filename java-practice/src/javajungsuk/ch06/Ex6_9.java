package javajungsuk.ch06;

class Data1{ int x;}

public class Ex6_9 {
    public static void main(String[] args) {
        Data1 data = new Data1();
        data.x = 10;
        System.out.println("main() : x = " + data.x);

        change(data.x);
        System.out.println("After change(data.x)");
        System.out.println("main() : x = " + data.x);
    }

    static void change(int x) {
        x = 1000;
        System.out.println("change() : x = " + x);
    }
}
