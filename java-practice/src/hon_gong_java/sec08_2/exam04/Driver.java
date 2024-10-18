package hon_gong_java.sec08_2.exam04;

import hon_gong_java.sec08_2.exam03.*;

public class Driver {
    // 메소드 매개변수 vehicle에는 Bus 객체, Taxi 객체가 올 수 있음
    public void drive(Vehicle vehicle){
        if(vehicle instanceof Bus){     // vehicle이 참조하는 객체가 Bus인지 조사
            Bus bus = (Bus) vehicle;    // 강제 타입 변환
            bus.checkFare();
        }
        vehicle.run();
    }
}
