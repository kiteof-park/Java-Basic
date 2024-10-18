package hon_gong_java.sec08_2.exam03;

public class VehicleExample {
    public static void main(String[] args) {
        Vehicle vehicle = new Bus();

        vehicle.run();              // Bus 메소드 호출
//        vehicle.checkFare();        // 인터페이스 타입으로 Bus 메소드 호출 불가

        Bus bus = (Bus) vehicle;    // 강제 타입 변환
        bus.run();
        bus.checkFare();

    }
}
