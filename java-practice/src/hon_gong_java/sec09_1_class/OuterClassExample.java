package hon_gong_java.sec09_1_class;

public class OuterClassExample {
    public static void main(String[] args) {
        OuterClass01 outerObj = new OuterClass01();

        // 인스턴스 멤버 클래스 객체 생성
        OuterClass01.InstanceInnerClass innerObj = outerObj.new InstanceInnerClass();
        innerObj.field1 = 3;
        innerObj.method1();

        // 정적 멤버 클래스 객체 생성
        OuterClass01.StaticInnerClass staticObj = new OuterClass01.StaticInnerClass();
        
        // 정적 멤버 클래스의 인스턴스 필드/메소드
        staticObj.field1 = 5;
        staticObj.method1();
        
        // 정적 멤버 클래스의 정적 필드/메소드
        OuterClass01.StaticInnerClass.field2 = 10;
        OuterClass01.StaticInnerClass.method2();
        
        // 로컬 클래스 객체 생성을 위한 메소드 호출
        outerObj.method();
    }
}
