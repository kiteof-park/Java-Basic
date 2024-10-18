package sec05.chap08.ex02;

public class Main {
    
    // FormElement의 자식 클래스 인스턴스 모두가 인자로 들어올 수 있음
    // 다형성
    public static void clickFormElement (FormElement fe){
        fe.func();
    }
    public static void main(String[] args) {
        Button button1 = new Button(2, "Enter");
        Switch switch1 = new Switch(3, true);

        // DropDown의 매개변수로 들어가는 배열을 선언하면서 생성
        DropDown dropDown1 = new DropDown(5, new String[]{
                "이름 오름차순", "이름 내림차순",
                "크기 오름차순", "크기 내림차순",
                "날짜 오름차순", "날짜 내림차순"
        });

        // 다형성 적용 확인
        // FormElement[]에 넣어서 foreach 돌리는 방법도 있음
        clickFormElement(button1);

        clickFormElement(switch1);
        clickFormElement(switch1);

        clickFormElement(dropDown1);

    }
}
