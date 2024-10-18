package hon_gong_java.sec03.exma02;

public class Dog extends Animal{

    public Dog(String kind){
        this.kind = kind;
    }
    
    // 추상 메서드 재정의
    @Override
    public void sound() {
        System.out.println("멍멍");
    }
}
