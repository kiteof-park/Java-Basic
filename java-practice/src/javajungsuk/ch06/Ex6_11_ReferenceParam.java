package javajungsuk.ch06;

public class Ex6_11_ReferenceParam {
    public static void main(String[] args) {
        // 크기가 1인 배열, x는 배열 객체를 참조하는 참조변수
        int[] x = {10};
        System.out.println("main() : x = " + x[0]);
        
        change(x);
        System.out.println("After change(x)");
        System.out.println("main() : x = " + x[0]);
        System.out.println(x.hashCode());

    }

    static void change(int[] x){
        x[0] = 1000;
        System.out.println("change() : x = " + x[0]);
        System.out.println(x.hashCode());
    }
}
