package hon_gong_java.sec09_1_class;

public class OuterClass04 {

    // 외부 클래스의 인스턴스 메소드
    public void mehtod(int arg){
        int localVariable = 1;
        
        // 매개변수와 로컬 변수가 로컬 클래스 내부에서 사용되므로 final 특성을 ㄱ자ㅣㅁ
//        arg = 10;
//        localVariable = 10;
        
        // 메소드 내의 로컬 클래스
        class LocalInnerClass{
            public void method(){
                int result = arg + localVariable;
            }
        }
    }
}
