package javajungsuk.ch08;

public class Ex8_11_MyException extends Exception{
    private final int ERR_CODE;

    Ex8_11_MyException(String msg, int err_code){
        super(msg);
        this.ERR_CODE = err_code;
    }

    Ex8_11_MyException(String msg){
        this(msg, 100);
    }

    public int getErrCode(){
        return ERR_CODE;
    }
}
