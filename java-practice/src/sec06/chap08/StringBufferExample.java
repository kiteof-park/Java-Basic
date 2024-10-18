package sec06.chap08;

public class StringBufferExample {
    public static void main(String[] args) {
        StringBuffer strBfr1 = new StringBuffer();
        StringBuffer strBfr2 = new StringBuffer(2);     // capacity를 직접 지정
        StringBuffer strBfr3 = new StringBuffer("Hello");

        int[] capacity = new int[]{
                strBfr1.capacity(), strBfr2.capacity(), strBfr3.capacity()
        };
        
        strBfr1.append("안녕하세요");
        strBfr2.append("안녕하세요");
        strBfr3.append("안녕하세요");

        int[] newCapacity = new int[]{
                strBfr1.capacity(), strBfr2.capacity(), strBfr3.capacity()
        };

        String strBfr3Out = strBfr3.toString();

    }
}
