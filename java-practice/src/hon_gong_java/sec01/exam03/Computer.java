package hon_gong_java.sec01.exam03;

public class Computer extends Calculator{

    @Override
    double areaCircle(double r) {
        System.out.println("Computer객체의 areaCircle()실행");
        return Math.PI * r * r;

    }
}
