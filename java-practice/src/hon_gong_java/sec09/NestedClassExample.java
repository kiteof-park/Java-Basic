package hon_gong_java.sec09;

public class NestedClassExample {
    public static void main(String[] args) {
        Car car = new Car();

        // 다른 클래스에서 멤버 클래스의 객체 생성 코드 작성
        Car.Tire tire = car.new Tire(); // 또는 Car.Tire tire = new Car().new Tire();


        Car.Engine engine = new Car.Engine();
    }
}
