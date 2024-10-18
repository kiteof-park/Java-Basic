package hon_gong_java.sec02.exam06;

public class InstanceofExample {
    public static void method1(Parent parent){
        if(parent instanceof Child){
            Child child = (Child) parent;
            System.out.println("method1 - Child로 변환 성공");
        } else{
            System.out.println("method1 - Child로 변환 실패");
        }
    }

    public static void method2(Parent parent){
        Child child = (Child) parent;
        System.out.println("method2- - Child로 변환 성공");
    }

    public static void main(String[] args) {

        Parent parentA = new Child(); 
        // Child 객체를 매개값으로 전달
        method1(parentA);
        method2(parentA);
    
        // Parent 객체를 매개값으로 전달
        Parent parentB = new Parent();
        method1(parentB);
        method2(parentB);

    }
}
