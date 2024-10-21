package javajungsuk.Excercise08;

// 📌 8-10. 아래의 코드가 수행되었을 때의 실행결과를 적으시오
// 실행 결과: 2 4 7

public class Ex8_10 {
    public static void main(String[] args) {
        try{
            method1();                               // 1.
            System.out.println(6);
        } catch (Exception e){                       // 8.
            System.out.println(7);                   // 9.
        }
    }
    static void method1() throws Exception{
        try{
            method2();                              // 2.
            System.out.println(1);
        } catch (NullPointerException e){           // 3.
            System.out.println(2);                  // 4.
            throw e;                                ⚠️// 5.     ✅// 7.
        } catch (Exception e){
            System.out.println(3);
        } finally {                                 ⚠️// 6.     ✅// 5.
            System.out.println(4);                  ⚠️// 7.     ✅// 6.
        }

        System.out.println(5);
    }

    static void method2(){
        throw new NullPointerException();          // 3.
    }
}

/* ✏️ 💡
* 않이.. method 선언부에 thorws 예외 선언 안하면 어떻게 되는거임 ㅜ?
* 일단 호출하는 쪽으로 던져진다는 가정하에 실행결과 작성
* -> 💡 메서드 예외 선언은 Checked Exception만 명시적으로 선언한다.
* -> 💡 Checked Exception의 경우, 예외가 발생하면 자동으로 상위 호출 스택으로 예외가 전달된다.
*
* 💡finally{..}의 경우 예외가 발생하든, 발생하지 않든 항상 실행되므로
* method1()에서 throw e;로 예외를 상위로 던지기 전에 먼저 수행된다.
*
* */