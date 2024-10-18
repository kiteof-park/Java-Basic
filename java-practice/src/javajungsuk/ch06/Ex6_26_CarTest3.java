package javajungsuk.ch06;

public class Ex6_26_CarTest3 {
    public static void main(String[] args) {
        Car car1 = new Car("blue", "auto", 4);
        Car car2 = new Car(car1);

        System.out.println("car1입니다 " + car1);
        System.out.println("car2입니다 " + car2);

        System.out.println(car1.hashCode());
        System.out.println(car2.hashCode());

    }
}

