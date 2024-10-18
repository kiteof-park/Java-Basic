package sec06.chap05;

public class Ex03 {
    public static void main(String[] args) {
        if (args.length < 2){
            System.out.println("메뉴와 맵기를 모두 입력해주세요.");
            return;
        }

        String menu = args[0];
        String level = args[1];

        if(level.length() != 1 ){
            System.out.println("맵기를 한 자리 숫자로 입력해주세요.");
            return;
        }

        if(!"0123456789".contains(level)){
            System.out.println("맵기는 숫자로 입력해주세요.");
            return;
        }

        System.out.printf("%s 맵기 단계 %s로 주문 %n", menu, level);
    }
}
