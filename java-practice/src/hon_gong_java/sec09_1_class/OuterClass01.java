package hon_gong_java.sec09_1_class;

// 외부 클래스
public class OuterClass01 {
    // 외부 클래스 생성자
    public OuterClass01(){
        System.out.println("OuterClass 객체 생성");
    }

    // 1. 인스턴스 멤버 클래스
    class InstanceInnerClass{
        // 인스턴스 멤버 클래스 생성자
        InstanceInnerClass(){
            System.out.println("InstanceInnerClass 객체 생성");
        }

        // 인스턴스 멤버 클래스 필드
        int field1;
        // 인스턴스 멤버 클래스 메소드
        void method1(){}
    }
    
    // 2. 정적 멤버 클래스
    static class StaticInnerClass{
        // 정적 멤버 클래스 생성자
        StaticInnerClass(){
            System.out.println("StaticInnerClass 객체 생성");
        }
        // 정적 멤버 클래스 필드
        int field1;
        static int field2;

        // 정적 멤버 클래스 메소드
        void method1(){}
        static void method2(){}
    }
    
    // 외부 클래스의 메소드
    void method(){
        // 3. 로컬 클래스
        class LocalClass{
            // 로컬 클래스 생성자
            LocalClass(){
                System.out.println("LocalClass 객체 생성");
            }
            // 로컬 클래스 필드
            int field1;

            // 로컬 클래스 메소드
            void method1(){}
        }

        // 외부 클래스 메소드에서 로컬 클래스 사용
        LocalClass localClassObj = new LocalClass();
        localClassObj.field1 = 10;
        localClassObj.method1();
    }



}
