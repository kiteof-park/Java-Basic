package sec04.chap05;

public class Ex01 {

    static void calculator (double a, double b){
        System.out.printf("%.2f + %.2f = %.2f%n", a, b, a+b);
        System.out.printf("%.2f + %.2f = %.2f%n", a, b, a-b);
        System.out.printf("%.2f + %.2f = %.2f%n", a, b, a*b);
        System.out.printf("%.2f + %.2f = %.2f%n", a, b, a/b);
    }

    public static void main(String[] args) {
        double x1 = 3, y1 = 4;
        calculator(x1, y1);

        double x2 = 7, y2 = 5;
        calculator(x2, y2);
    }
}
