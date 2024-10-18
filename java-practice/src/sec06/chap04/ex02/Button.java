package sec06.chap04.ex02;

public class Button {
    String name;
    public  Button(String name){
        this.name = name;
    }

    //  ⭐️ 인터페이스를 상속한 클래스 자료형을 필드로 가짐
    // OnClickListner는 onClick() 메서드를 가지고 있음
    // 각 버튼들은 클릭했을 때 클릭에 반응하는 메소드(onCick())를 가진 OnClickListner클래스의 인스턴스를 가짐

    // 클래스의 인스턴스를 필드로 가짐
    private OnClickListner onClickListner;

    // 클래스의 인스턴스를 외부에서 생성하고, 현재  Button 인스턴스의 필드로 설정
    public void setOnClickListner(OnClickListner onClickListner){
        this.onClickListner = onClickListner;
    }

    public void func(){
        onClickListner.onClick();
    }
}
