package hon_gong_java.sec03.exma02;

public class Cat extends Animal {

    public Cat(String kind){
        this.kind = kind;
    }

    // 추상 메서드 재정의
    @Override
    public void sound() {
        System.out.println("냐용");
    }
}
