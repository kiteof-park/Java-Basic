package sec05.chap02.ex03;

public class YalcoChicken {
    int no;
    String name;
    // 클래스의 필드가 다른 클래스의 인스턴스를 담은 배열
    ChickenMenu[] menus;

    // 생성자
    YalcoChicken(int no, String name, ChickenMenu[] menus){
        this.no = no;
        this.name = name;
        this.menus = menus;
    }

    ChickenMenu orderMenu (String name){
        for(ChickenMenu menu : menus){
            if(menu.name.equals(name)){
                return menu;
            }
        }
        return null;
    }


}
