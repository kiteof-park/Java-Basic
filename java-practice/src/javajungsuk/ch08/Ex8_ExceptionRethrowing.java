package javajungsuk.ch08;

public class Ex8_ExceptionRethrowing {
    public static void main(String[] args) {
        try{
            myMehtod();
        } catch (MyException1 e1){
            System.out.println("main()에서 " + e1.getMessage() + " 예외 처리");
        } catch (MyException2 e2){
            System.out.println("main()에서 " + e2.getMessage() + " 예외 처리");
        }
        // 💡 MyException1은 예외 처리 안됨 -> finally에서 던진 예외 떄문
    }

    static void myMehtod() throws MyException1, MyException2{
        try{
            throw new MyException3("MyException3  발생");
        } catch (MyException3 e3){
            System.out.println("myMethod()에서 " + e3.getMessage() + " 예외 처리");
            throw new MyException1("MyException1 발생");
        } finally{
            throw new MyException2("MyException2 발생");
        }
    }
}

class MyException1 extends Exception{ MyException1(String msg){ super(msg); } }
class MyException2 extends Exception{ MyException2(String msg){ super(msg); } }
class MyException3 extends Exception{ MyException3(String msg){ super(msg); } }
