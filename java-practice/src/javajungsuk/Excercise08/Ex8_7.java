package javajungsuk.Excercise08;

// 📌 8-7. 아래 코드가 수행되었을 떄의 실행결과를 적으시오
// 실행 결과 : 1 출력 후 System.exit(0)으로 프로그램 종료

public class Ex8_7 {
    public static void main(String[] args) {
        method(true);                       // 1.
        method(false);
    }

    static void method(boolean b){
        try{
            System.out.println(1);             // 2.
            if(b) System.exit(0);       // 3.
            System.out.println(2);
        } catch (RuntimeException r){
            System.out.println(3);
            return;
        } catch (Exception e){
            System.out.println(4);
            return;
        } finally {
            System.out.println(5);
        }

        System.out.println(6);
    }
}

/* ✏️
* method(true) -> System.exit(0); 에 의헤 프로그램 종료
* /

/* 💡
* System.exit(0); 이 수행되어 프로그램이 즉시 종료된다.
* 이런 경우 finally{} 가 실행되지 않는다.
*/
