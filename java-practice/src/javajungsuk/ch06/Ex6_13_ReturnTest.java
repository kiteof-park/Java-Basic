package javajungsuk.ch06;

public class Ex6_13_ReturnTest {
    public static void main(String[] args) {
        int result = add(3, 5);
        System.out.println(result);

        // 크기가 1인 배열, 참조변수 resultArr -> 배열 객체를 참조
        int[] resultArr = {0};
        add(4, 8, resultArr);
        System.out.println(resultArr[0]);
    }

    static int add(int a, int b){return a + b;}

    // resultArr이 참조하는 배열의 0번 인덱스에 a + b를 저장
    static void add(int a, int b, int[] result){ result[0] = a + b; }
}
