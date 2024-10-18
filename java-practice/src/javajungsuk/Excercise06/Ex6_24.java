package javajungsuk.Excercise06;

public class Ex6_24 {
    
    // 삼항 연산자로 간결하게 작성 가능하다.
    public static int abs(int value){
//        if(value < 0){
//            return value * (-1);
//        }
//        return value;

        return value < 0 ? -value : value;
    }

    public static void main(String[] args) {
        int value = 5;
        System.out.println(value+"의 절대값: " + abs(value));

        value = -10;
        System.out.println(value+"의 절대값: " + abs(value));
    }
}
