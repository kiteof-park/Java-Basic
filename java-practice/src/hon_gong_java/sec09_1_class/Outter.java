package hon_gong_java.sec09_1_class;

// 내부 클래스에서 외부 클래스 참조 얻기
public class Outter {
    String field = "Outter Field";
    void method(){
        System.out.println("Outter Mehtod");
    }

    // 내부 클래스 - 인스턴스 멤버 클래스
    class Nested{
        String field = "Nested Field";
        void method(){
            System.out.println("Nested Method");
        }
        void print(){
            System.out.println("내부 클래스의 객체 참조");
            System.out.println(this.field);
            this.method();

            System.out.println("내부 클래스에서 외부 클래스의 객체 참조");
            System.out.println(Outter.this.field);
            Outter.this.method();
        }
    }
}
