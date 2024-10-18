package hon_gong_java.sec08_2.exam02;

public class DriverExample {
    public static void main(String[] args) {
        Driver driver = new Driver();

        // 자동 타입 변환
        driver.drive(new Bus());    // Vehicle vehicle = new Bus();
        driver.drive(new Taxi());   // Vehicle vehicle = new Taxi();
    }
}
