package sec03.chap05;

public class Ex01 {
    public static void main(String[] args) {
//        String str1 = "박의연 최고";
//        String str2 = "박의연 짱짱";
//        String str3 = new String("나는 왜 이렇게 멋질까");

        String hl1 = "Hello";
        String hl2 = "Hello";
        String wld = "World";

        boolean bool1 = hl1 == hl2; // true
        boolean bool2 = hl1 == wld; // false

        String hl3 = new String("Hello");
        String hl4 = new String("Hello");
        String hl5 = hl4;

        boolean bool3 = hl3 == hl4; // false

        boolean bool4 = hl1.equals(hl2); // true
        boolean bool5 = hl1.equals(hl3); // true
        boolean bool6 = hl3.equals(hl4); // true
        boolean bool7 = wld.equals(hl2); // false

        boolean bool8 = hl4 == hl5; // 주소비교, true

        int hl1hash = System.identityHashCode(hl1);
        int hl2hash = System.identityHashCode(hl2);
        int hl3hash = System.identityHashCode(hl3);
        int hl4hash = System.identityHashCode(hl4);
        int hl5hash = System.identityHashCode(hl5);
    }
}
