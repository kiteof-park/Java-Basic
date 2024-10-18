package hon_gong_java.sec01.exam03;

public class ComputerExample {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        Computer com = new Computer();

        double calCricle = cal.areaCircle(3);
        System.out.println(calCricle);

        double comCircle1 = com.areaCircle(3);
        System.out.println(comCircle1);

    }
}
