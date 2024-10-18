package sec06.chap07.ex02;

public class Main {
    public static void main(String[] args) {
        Button button  = new Button();
        
        // Button 클래스 내부의 ClickInfo Record 사용 -> Button.ClickInfo
        // func()메소드를 통해 ClickInfo를 각각 반환받음
        Button.ClickInfo click1 = button.func(123, 456, Button.ClickedBy.LEFT);
        Button.ClickInfo click2 = button.func(497, 92, Button.ClickedBy.LEFT);
        Button.ClickInfo click3 = button.func(12, 36, Button.ClickedBy.RIGHT);

        // ClickInfon의 printInfo() 메소드 호출
        for(var click : new Button.ClickInfo[]{click1, click2, click3}){
            click1.printInfo();
        }
    }
}
