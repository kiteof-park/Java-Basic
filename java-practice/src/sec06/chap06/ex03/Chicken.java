package sec06.chap06.ex03;

public class Chicken {
    // 모든 열거 상수(객체, 인스턴스)를 배열로 가지고 있음
    static ChickenMenu[] menus = ChickenMenu.values();

    public void takeOrder(String menuName){
        ChickenMenu ordered = null;

        for(ChickenMenu menu : menus){
            if(menu.getName().equals(menuName)){
                ordered = menu;
            }
        }

        if (ordered == null){
            System.out.println("해당 메뉴가 없습니다.");
            return;
        }

        System.out.println(
                ordered.getPrice() + "원 입니다."
        );
    }
}
