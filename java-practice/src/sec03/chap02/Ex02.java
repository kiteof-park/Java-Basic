package sec03.chap02;

public class Ex02 {
    public static void main(String[] args) {
        float fMin = -Float.MAX_VALUE;
        float fMax = Float.MAX_VALUE;

        double dMin = -Double.MAX_VALUE;
        double dMax = Double.MAX_VALUE;

        float fAbsMin = Float.MIN_VALUE;
        double dAbsMin = Double.MIN_VALUE;

        boolean bool1 = Float.MAX_VALUE < Double.MAX_VALUE;
        boolean bool2 = Float.MIN_VALUE > Double.MIN_VALUE;

        //  최대 정밀도 테스트
        double dblNum = 0.123456789123456789;
        float fltNum = 0.123456789123456789f;

    }
}
