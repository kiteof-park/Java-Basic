package hon_gong_java.sec09_2_interface;

public class Button {
    
    // 인터페이스 타입 필드
    OnClickListener listener;
    
    // 매개 변수의 다형성
    // setter(), 구현 객체를 받아 필드에 대입
    void setOnClickListener(OnClickListener listener){
        this.listener = listener;
    }
    
    // 구현 객체의 onClick() 메소드 호출
    void touch(){
        listener.onClick();
    }

    // 중첩 인터페이스 -> 구현 클래스/구현 객체가 필요
    static interface OnClickListener{
        void onClick();
    }
}
