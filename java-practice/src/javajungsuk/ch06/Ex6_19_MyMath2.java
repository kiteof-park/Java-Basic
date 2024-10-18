package javajungsuk.ch06;

class MyMath2{
    // 인스턴스 변수(iv)
    long a, b;

    // 인스턴스 메서드(im) -> iv를 사용하므로 매개변수가 필요없다.
    long add(){return a + b;}
    long substract(){return a - b;}
    long multipy(){return a * b;}
    double divide(){return a /(double)b; }

    // 클래스 메서드(sm) -> iv를 사용하지 못하므로 매개변수가 필요하다.
    static long add(long a, long b){return a + b;}
    static long subtract(long a, long b){return a - b;}
    static long multiply(long a, long b){return a * b;}
    static double divide(double a, double b){return a / b;}

}

public class Ex6_19_MyMath2 {
    public static void main(String[] args) {
        // 인스턴스 메서드 사용
        System.out.println("인스턴스 메서드 사용");
        MyMath2 mm = new MyMath2();
        mm.a = 50;
        mm.b = 12;
        System.out.println(mm.add());
        System.out.println(mm.substract());
        System.out.println(mm.multipy());
        System.out.printf("%.2f",mm.divide());

        System.out.println();
        
        // 클래스 메서드 사용
        System.out.println("클래스 메서드 사용");
        System.out.println(MyMath2.add(200, 100));
        System.out.println(MyMath2.subtract(300, 150));
        System.out.println(MyMath2.multiply(10, 50));
        System.out.printf("%.2f", MyMath2.divide(100, 20));
    }
}


