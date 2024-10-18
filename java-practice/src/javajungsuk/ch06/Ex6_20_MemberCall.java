package javajungsuk.ch06;

public class Ex6_20_MemberCall {
    int iv = 10;
    static int cv1 = 20;

    // 클래스 변수가 인스턴스 변수를 사용하려면, 객체를 생성해서 사용
    // static int cv2 = iv;
    static int cv2 = new Ex6_20_MemberCall().iv;

    static void staticMethod1(){
        System.out.println(cv1);
        // System.out.println(iv);
        System.out.println(new Ex6_20_MemberCall().iv);
    }

    void instanceMethod1(){
        System.out.println(cv1);
        System.out.println(cv2);
        System.out.println(iv);
    }

    static void staticMethod2(){
        staticMethod1();
//        instanceMethod1();
//        Ex6_20_MemberCall c = new Ex6_20_MemberCall();
//        c.instanceMethod1();

        new Ex6_20_MemberCall().instanceMethod1();
    }
    void instanceMethod2(){
        staticMethod1();
        instanceMethod1();
    }
}
