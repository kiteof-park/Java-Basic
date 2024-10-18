package javajungsuk.ch06;

class Data2{ int x;}

public class Ex6_7 {
    public static void main(String[] args) {
        Data2 data = new Data2();
        data.x = 10;
        System.out.println("main() : x = " + data.x);

        change(data);
        System.out.println("After change(data)");
        System.out.println("main() : x = " + data.x);
    }
    
    // 참조형 매개변수
    static void change(Data2 data) {
        data.x = 1000;
        System.out.println("change() : x = " + data.x);
    }
}
