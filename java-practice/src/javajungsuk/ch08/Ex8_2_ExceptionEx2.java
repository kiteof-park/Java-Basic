package javajungsuk.ch08;

public class Ex8_2_ExceptionEx2 {
    public static void main(String[] args) {
        int number = 100;
        int result = 0;

        for(int i = 0; i < 30; i++){
            try{
                result = number / (int)(Math.random() * 10);
                System.out.println(result);
            } catch (ArithmeticException ae){
                System.out.println("ArithmeticException 해결");
            }
        }
    }
}
