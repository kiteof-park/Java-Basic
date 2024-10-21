package javajungsuk.Excercise08;

// 📌 8-6. 아래 코드가 수행되었을 떄의 실행결과를 적으시오
// 실행 결과 1 3 5 1 2 5 6

public class Ex8_5 {
    public static void main(String[] args) {
        method(true);                               // 1.
        method(false);                                      // 8.
    }

    static void method(boolean b){
        try{
            System.out.println(1);                    // 2.     // 9.
            if(b) throw new ArithmeticException();    // 3.
            System.out.println(2);                              // 10.
        } catch (RuntimeException r){                 // 4.
            System.out.println(3);                    // 5.
            return;
        } catch (Exception e){
            System.out.println(4);
            return;
        } finally {                                 // 6.
            System.out.println(5);                  // 7.       // 11.
        }
        System.out.println(6);                                  // 12.
    }
}


/* ✏️
* method(true) 
* -> ArithmeticException()발생 -> catch(RuntimeExeption r){...}
* -> return 되기 전에 finally{...} 수행
* -> 💡 catch{}에 return;이 있으므로 try-catch-finally 밖의 문장은 수행되지 않음
*
* method(false)
* -> try{...} 수행 
* -> 예외가 발생하지 않았으므로 catch{...} 건너뜀
* -> 예외 발생 여부와 상관없이 finally{...} 수행
* -> try-catch-finally 밖의 문장 수행
* */