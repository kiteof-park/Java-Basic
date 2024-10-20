package javajungsuk.ch08;

public class Ex8_13_ExceptionEx13 {
    public static void main(String[] args) {
//        method1();
        try{
            method1();
        } catch (Exception e){
            System.out.println(e.getMessage());
            System.out.println("main()에서 예외 처리");
        }
    }
    
//    static void method1(){
//        try{
//            throw new Exception("method1()에서 예외 발생");
//        }
//        catch (Exception e){
//            System.out.println(e.getMessage());
//            System.out.println("method1()에서 예외 처리");
//        }
//    }
    static void method1() throws Exception{
        throw new Exception("method1()에서 예외 발생");
    }
}
