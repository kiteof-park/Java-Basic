package sec03.chap01;

public class Ex02 {
    public static void main(String[] args) {
        byte byteNum;
        int smallIntNum = 123;

        byteNum = (byte)smallIntNum;

        smallIntNum = 12345;

        byteNum = (byte)smallIntNum;
    }
}
