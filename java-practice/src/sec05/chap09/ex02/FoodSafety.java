package sec05.chap09.ex02;

public interface FoodSafety {
    // ⭐ static : 클래스 메소드
    // 인스턴스가 아니라 인터페이스 자체가 실행하는 기능
    static void announcement(){
        System.out.println("식품안전 관련 공지");
    }

    // ⭐ default : 인터페이스에서 구상 메소드 작성 가능하도록 함
    default void regularInstpection(){
        System.out.println("정기 체크");
    }

    // 추상 메소드
    void cleanKitchen();
    void employeeEducation();
}
