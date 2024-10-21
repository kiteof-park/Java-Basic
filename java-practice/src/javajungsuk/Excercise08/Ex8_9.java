package javajungsuk.Excercise08;

// 📌 8-9. 다음과 같은 조건의 예외클래스를 작성하고 테스트하시오(생성자는 실행결과를 보고 알맞게 작성)
// 💡 Exception이 발생하면 자동으로 getMessage() 호출?

public class Ex8_9 {
    public static void main(String[] args) throws Exception{
        throw new UnsupportedFunctionException("지원하지 않는 기능입니다.", 100);
    }
}

class UnsupportedFunctionException extends RuntimeException{
    final private int ERR_CODE;
    final private String errMsg;
    UnsupportedFunctionException(String errMsg, int ERR_CODE){
        this.errMsg = errMsg;
        this.ERR_CODE = ERR_CODE;
    }

    UnsupportedFunctionException(String errMsg){
        this.errMsg = errMsg;
        this.ERR_CODE = 100;
    }

    public int getErrorCode(){
        return ERR_CODE;
    }

    @Override
    public String getMessage() {
        return "["+ERR_CODE+"]" + errMsg;
    }

}

/* 💡
* 1. RuntimeException도 Exception의 자손이다.
* 2. Exception을 상속하는 클래스를 정의하는 경우, 문자열을 매개변수로 받는 생성자를 작성하고
*    Exception클래스의 생성자를 호출한다 super(msg)
* 3. 문자열(예외메시지)의 경우 예외 클래스의 필드로 정의하지 않는다.
*
* 💡 예외 메세지를 저장하는 msg의 경우 상속 받은 것이므로 조상의 생성자를 호출해서 초기화되도록 해야 한다.
* 💡 getMessage() 메서드도 조상으로부터 상속받은 것이며, 조상의 메서드를 오버라이딩할 때 가능하면 조상 메서드를 재사용하는 것이 좋다.
* */
