package javajungsuk.ch06;

public class Ex6_3_TvTest {
    public static void main(String[] args) {
        Tv t1 = new Tv();
        Tv t2 = new Tv();

        System.out.println("t1의 해시코드: "+ t1.hashCode());
        System.out.println("t2의 해시코드: " + t2.hashCode());

        System.out.println();
        System.out.println("After t1=t2");
        System.out.println();

        // t1과 t2가 참조하는 객체가 동일해진다.
        t1 = t2;

        System.out.println("t1의 해시코드: " + t1.hashCode());
        System.out.println("t2의 해시코드: " + t2.hashCode());

    }
}
