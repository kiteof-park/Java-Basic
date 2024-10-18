package hon_gong_java.sec08_2.exam02;

public class Driver {
    // 매개변수의 다형성 - 메소드의 매개변수를 인터페이스 타입으로 선언
    // 인터페이스를 구현한 클래스의 객체는 모두 매개값으로 올 수 있다.
    public void drive(Vehicle vehicle){
        vehicle.run();  // 구현 객체에 따라 재정의된 run() 호출
    }
}
