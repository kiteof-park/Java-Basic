package hon_gong_java.sec08_2.exam04;

import hon_gong_java.sec08_2.exam03.*;

public class DriverExample {
    public static void main(String[] args) {
        Driver driver = new Driver();

        // 자동 타입 변환
        Vehicle vehicle1 = new Bus();
        Vehicle vehicle2 = new Taxi();

        driver.drive(vehicle1);
        driver.drive(vehicle2);
    }
}
