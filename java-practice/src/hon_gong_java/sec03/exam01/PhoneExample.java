package hon_gong_java.sec03.exam01;

public class PhoneExample {
    public static void main(String[] args) {

//        Phone phone = new Phone();

        SmartPhone smartPhone = new SmartPhone("의연공주");

        smartPhone.turnOn();
        smartPhone.turnOff();
        smartPhone.internetSearch();
        System.out.println(smartPhone.owner);


    }
}
