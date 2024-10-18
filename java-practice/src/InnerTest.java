//public class InnerTest{
//    class InstanceInner{
//        int iv = 100;
//        final static int CONST = 100;
//    }
//    static class StaticInner{
//        int iv = 200;
//        final static int CONST = 200;
//    }
//
//    void myMethod(){
//        class LocalInner{
//            int iv = 300;
//            final static int CONST= 300;
//        }
//        System.out.println(LocalInner.CONST);
//    }
//
//    public static void main(String[] args) {
//        System.out.println(InstanceInner.CONST);
//        System.out.println(StaticInner.CONST);
//        // System.out.println(LocalInner.CONST);
//        InnerTest innerTest = new InnerTest();
//        innerTest.myMethod();
//    }
//}

class InnerTest{
    // 1. 인스턴스 내부 클래스
    class InstanceInner { }
    // 2. static 내부 클래스
    static class StaticInner { }

    InstanceInner iv = new InstanceInner();       // ✅ 인스턴스 멤버끼리 접근 가능
    static StaticInner cv1 = new StaticInner();   // ✅ staic 멤버끼리 접근 가능
    //static StaticInner cv2 = new InstanceInner(); // ⚠️ static멤버 -> 인스턴스 멤버 접근 불가

    static void staticMethod(){
        //InstanceInner obj1 = new InstanceInner(); // ⚠️ static -> 인스턴스 접근 불가
        StaticInner obj2 = new StaticInner();

        // 인스턴스 클래스는 외부 클래스를 먼저 생성해야 생성 가능
        InnerTest outer = new InnerTest();
        InstanceInner obj1 = outer. new InstanceInner();
    }

    // 인스턴스 메서드에서는 인스턴스 멤버, static 멤버 모두 접근 가능
    void instanceMethd(){
        InstanceInner obj1 = new InstanceInner();
        StaticInner obj2 = new StaticInner();
        // LocalInner lv = new LocalInner();   // ⚠️지역 내부 클래스는 외부에서 접근 불가
    }

    void myMethod(){
        class LocalInner{ }
        LocalInner lv = new LocalInner();
    }
}





