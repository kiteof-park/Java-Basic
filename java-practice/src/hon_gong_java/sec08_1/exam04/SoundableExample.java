package hon_gong_java.sec08_1.exam04;

public class SoundableExample {

    // 인터페이스 - 메소드 매개값
    public static void printSound(Soundable soundable){
        System.out.println(soundable.sound());

    }

    public static void main(String[] args) {
        printSound(new Cat());
        printSound(new Dog());
    }
}
