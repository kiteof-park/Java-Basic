package javajungsuk.ch06;

public class Ex6_10_ReferenceParam {
    public static void main(String[] args) {
        Data d = new Data();
        d.x = 10;
        System.out.println("main() : x = " + d.x);

        change(d);
        System.out.println("After change(d)");
        System.out.println("main() : x = " + d.x);

        // main과 change가 참조하는 객체가 동일한지 확인
        System.out.println(d.hashCode());

    }

    static void change(Data d){
        d.x = 1000;
        System.out.println("change() : x " + d.x);
        
        // main과 change가 참조하는 객체가 동일한지 확인
        System.out.println(d.hashCode());
    }

}
