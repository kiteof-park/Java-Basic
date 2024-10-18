package javajungsuk.ch06;

public class Ex6_24_CarTest {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car("White", "Auto", 4);
        System.out.println();

    }
}

class Car{
    String color;
    String gearType;
    int door;

    Car(){}
    Car(String color, String gearType, int door){
        this.color = color;
        this.gearType = gearType;
        this.door = door;
    }

    // 생성자를 이용한 인스턴스의 복사
    Car(Car c){
//        this.color = c.color;
//        this.gearType = c.gearType;
//        this.door = c.door;
        this(c.color, c.gearType, c.door);
    }

    @Override
    public String toString() {
        return "color : %s, gearType : %s, door : %d "
                .formatted(color, gearType, door);
    }
}
