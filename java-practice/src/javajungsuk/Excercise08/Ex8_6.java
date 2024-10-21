package javajungsuk.Excercise08;
// 📌 8-6. 아래 코드가 수행되었을 떄의 실행결과를 적으시오
// 실행 결과 : method2()에서 NullPointerException으로 비정상 종료
public class Ex8_6 {
    public static void main(String[] args) {
        try{
            method1();                           // 1.
        } catch(Exception e){
            System.out.println(5);
        }
    }

    static void method1(){
        try{
            method2();                          // 2.
            System.out.println(1);
        } catch (ArithmeticException e){
            System.out.println(2);
        } finally {
            System.out.println(3);              
        }
    }

    static void method2(){
        throw new NullPointerException();       // 3.
    }
}

/* ✏️
*  main() -> method1() -> method2()
*  method2()에서 NullPointerException
*  method2()의 선언부에서 throws가 없으므로 method2()에서 비정상 종료
* */

/* 💡
* 1. NullPointerException은 Unchekced Exception이므로 예외를 명시적으로 선언하지 않아도 된다.
* 2. 예외가 발생하고 해당 메서드 내에서 처리되지 않으면, 그 예외는 호출한 쪽(상위 호출 스택)으로 전달
* -> '예외 전파(Exception Propagation' 이라고 한다.
* 3. 예외가 발생하고, catch{}가 없다면 예외는 상위 호출 스택으로 계속 전달된다.
* (⚠️ 단, Unchecked Exception일 경우)
*
* Checked Exception일 경우, 반드시 처리하거나 메서드에 thorws로 선언해야 상위 호출 스택으로 전달된다.
* Unchecked Exception일 경우 throws를 선언하지 않아도 자동으로 상위 호출 스택으로 전파된다.
*
* */