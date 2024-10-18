package javajungsuk.ch08;

public class Ex8_12 {
    public static void main(String[] args) {
        try{
            method1();
          // method1()에게 받은 예외 처리
        } catch (Exception e){
            System.out.println("main()에서 예외 처리");
        }
    }
    
    static void method1() throws Exception{
        try{
            throw new Exception();
        } catch (Exception e){
            System.out.println("method1()에서 예외 처리");
            // 다시 예외 발생 - 메서드 예외 선언에 의해 main()으로 던짐
            throw e;
        }
    } 
}
