package sec03.chap02;

public class Ex03 {
    public static void main(String[] args) {
        long lng1 = 123;

        float flt1 = lng1;
        double dbl1 = lng1;

        long lng2 = Long.MAX_VALUE;

        float flt2 = lng2;
        double dbl2 = lng2;

        //  💡 복합 대입 연산자와 단항 연산자
        float fl5 = 123.45F;
        fl5 += 6.78;
        fl5++; // 🔴
        fl5++;
        fl5--;


    }
}
