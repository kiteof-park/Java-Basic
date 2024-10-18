package javajungsuk.ch08;

public class FinallyExample {
    public static void main(String[] args) {
        System.out.println(finallyTest());
    }

    public static int finallyTest(){
        try{
            // return에 의해 값을 반환하기 전에
            return 19960519;
        } finally{
            // fianlly 블록 먼저 실행
            System.out.println("finally 블록 실행");
        }
    }
}
