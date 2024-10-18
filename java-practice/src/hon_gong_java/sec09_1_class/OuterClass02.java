package hon_gong_java.sec09_1_class;


// 외부 클래스 -> 내부 클래스 사용 제한
public class OuterClass02 {
    // 인스턴스 멤버 클래스
    class InstanceInner{}

    // 정적 멤버 클래스
    static class StaticInner{}

    // 외부 클래스의 인스턴스 필드
    InstanceInner instanceInner = new InstanceInner();
    StaticInner staticInner = new StaticInner();

    // 외부 클래스의 인스턴스 메소드
    void outerMethod(){
        InstanceInner var1 = new InstanceInner();
        StaticInner var2 = new StaticInner();
    }
    
    // 외부 클래스의 정적 필드
//    static InstanceInner field1 = new InstanceInner(); // error
    static StaticInner field2 = new StaticInner();

    // 외부 클래스의 정적 메소드
    static void outerStaticMethod(){
//        InstanceInner x = new InstanceInner(); // error
        StaticInner y = new StaticInner();
    }



}
