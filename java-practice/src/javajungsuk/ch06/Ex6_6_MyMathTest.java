package javajungsuk.ch06;

class MyMath{
    long add(long a, long b){ return a + b;}
    long substract(long a, long b){ return a - b;}
    long multiply(long a, long b){ return a * b;}
    double divide(double a, double b){ return a / b;}

}


public class Ex6_6_MyMathTest {
    public static void main(String[] args) {
        MyMath mm = new MyMath();

        // add()의 매개변수, 반환값 long타입 -> long 또는 long으로 자동 형변환이 가능한 값
        long resultAdd = mm.add(3, 5);
        long resultSub = mm. substract(3L, 5L);
        long resultMul = mm.multiply(3, 5);
        
        // int -> double 자동 형변환 가능, 5.0 / 3.0의 결과 반환
        double resultDiv = mm.divide(5, 3);

        System.out.println("result of add(): " + resultAdd);
        System.out.println("result of substract(): " + resultSub);
        System.out.println("result of multiply(): " + resultMul);
        System.out.println("result of divide(): " + resultDiv);
    }
}
