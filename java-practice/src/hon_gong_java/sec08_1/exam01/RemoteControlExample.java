package hon_gong_java.sec08_1.exam01;

public class RemoteControlExample {
    public static void main(String[] args) {
        
        // 인터페이스의 사용 - 인터페이스 변수에 구현 객체를 대입해서 사용
        RemoteControl rc1;
        rc1 = new Television();
        rc1.hashCode();

        RemoteControl rc2;
        rc2 = new Audio();
        rc2.hashCode();
    }
}
