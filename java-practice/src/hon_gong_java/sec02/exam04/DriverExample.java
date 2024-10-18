package hon_gong_java.sec02.exam04;

public class DriverExample {
    public static void main(String[] args) {

        Driver driver = new Driver();
        Vehicle vehicle = new Vehicle();
        Bus bus = new Bus();
        Taxi taxi = new Taxi();

        driver.drive(vehicle);

        // 자동 타입 변환(업캐스팅)
        driver.drive(bus);      // Vehicle vehicle = bus;
        driver.drive(taxi);     // Vehicle vehicle = taxi;

    }
}
