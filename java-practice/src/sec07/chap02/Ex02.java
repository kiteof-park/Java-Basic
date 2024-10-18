package sec07.chap02;

public class Ex02 {
    public static void main(String[] args) {
        //  💡 박싱 : 원시값을 래퍼 클래스의 인스턴스로
        //  ⭐ 과거에는 생성자를 사용했으나 deprecated
        int intPrim1 = 123;
        Integer intInst1 = Integer.valueOf(intPrim1);

        char chPrim1 = 'A';
        Character chInst1 = Character.valueOf(chPrim1);

        //  💡 언박싱 : 래퍼 클래스의 인스턴스를 원시값으로
        Double dbInst1 = Double.valueOf(3.14);
        double dbPrim1 = dbInst1.doubleValue();

        Boolean blnInst1 = Boolean.valueOf(false);
        boolean blnPrim1 = blnInst1.booleanValue();

        // 💡 오토 박싱(원시 -> 래퍼)
        Integer intInst2 = 123;
        Double dbInst2 = 3.14;

        // 💡 오토 언박싱(래퍼 -> 원시)
        char chPrim2 = Character.valueOf('B');
        boolean blnPrim2 = Boolean.valueOf(true);

        // 원시값과 래퍼 클래스 인스턴스 연산
        int intPrim2 = intPrim1 + intInst1;
        Integer intInst3 = intPrim2 + intInst2;

        // 메소드 등 사용처들에 혼용 가능
        Integer intInst4 = add(3, 5);


    }

    static int add(Integer a, Integer b){return a+b;}
}
