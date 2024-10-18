package hon_gong_java.sec08_2.exam01;

public class CarExample {
    public static void main(String[] args) {
        
        // 클래스의 필드를 인터페이스로 선언
        Car myCar = new Car();
        myCar.run();

        System.out.println("타이어를 교체합니다.");
        
        // 필드 교체
        myCar.frontRightTire = new KumhoTire();
        myCar.frontLeftTire = new KumhoTire();
        myCar.run();
    }
}
