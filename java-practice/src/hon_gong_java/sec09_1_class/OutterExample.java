package hon_gong_java.sec09_1_class;

// 내부 클래스에서 외부 클래스 참조 얻기
public class OutterExample {
    public static void main(String[] args) {
        // 외부 클래스 객체 생성
        Outter outter = new Outter();
        
        // 내부 클래스 객체 생성
        Outter.Nested nested = outter.new Nested();
        nested.print();
    }
}
