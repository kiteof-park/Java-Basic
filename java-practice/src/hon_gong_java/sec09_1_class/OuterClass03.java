package hon_gong_java.sec09_1_class;

// 내부 클래스 -> 외부 클래스 사용제한
public class OuterClass03 {

    // 외부 클래스의 인스턴스 필드/메소드
    int outerField;
    void outerMethod(){
        System.out.println("외부 클래스의 인스턴스 메소드");
    }

    // 외부 클래스의 정적 필드/메소드
    static int outerStaticField;
    static void outerStaticMethod(){
        System.out.println("외부 클래스의 정적 메소드");
    }

    // 내부 클래스 - 인스턴스 멤버 클래스
    // 외부 클래스의 모든 필드와 메소드에 접근 가능
    class InstanceInnerClass {
        void method(){
            outerField = 10;
            outerMethod();

            outerStaticField = 10;
            outerStaticMethod();
        }
    }

    // 내부 클래스 - 정적 멤버 클래스
    class StaticInnerClass{
        void methd(){
            // 외부 클래스의 인스턴스 멤버에 접근 불가
//            outerField = 10;
//            outerMethod();
            // 외부 클래스의 정적 멤버에 접근 가능
            outerStaticField = 15;
            outerStaticMethod();
        }
    }
}
