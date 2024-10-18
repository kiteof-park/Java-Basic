package sec04.chap03;

public class Ex01 {
    public static void main(String[] args) {
//        for(double d=123.45; d>0; d-=32.1){
//            System.out.println(d);
//        }

//        for(String s = ""; s.length()<11; s+=s.length()){
//            System.out.println(s);
//        }
        //  💡 쉼표로 구분하여 여럿 사용 가능
        //  ⚠️ 변수의 자료형은 한 종류만 가능 (혼용 안 됨)
        for (byte a = 0, b = 10; a <= b;) {
            System.out.printf("a: %d, b: %d%n", a++, b--);
        }
    }
}
