package sec06.chap06.ex03;

public class Main {
    public static void main(String[] args) {
        ChickenMenu menu1 = ChickenMenu.XX;
        ChickenMenu menu2 = ChickenMenu.PP;
        ChickenMenu menu3 = ChickenMenu.YN;

        String menu1Name = menu1.getName();
        int menu2Price = menu2.getPrice();
        String menu3Desc = menu3.getDesc();

        menu2.setPrice(16000);
        int menu2NewPrice = menu2.getPrice();

        //  ⭐️ 열거형의 메소드들
        ChickenMenu[] byNames = new ChickenMenu[]{
                ChickenMenu.valueOf("FR"),
                ChickenMenu.valueOf("PP"),
                ChickenMenu.valueOf("GJ")
        };
        //  💡 name 메소드 : 각 항목의 이름 반환
        String names[] = new String[]{
                menu1.name(), menu2.name(), menu3.name()
        };
        //  💡 ordinal 메소드 : 순번 반환
        int[] orders = new int[]{
                menu1.ordinal(), menu2.ordinal(), menu3.ordinal()
        };
        //  💡 values 메소드 : 전체 포함된 배열 반환
        // 반환 형태는 열거 타입의 상수 객체(인스턴스)
        ChickenMenu[] menus = ChickenMenu.values();

        //  menus의 각 요소는 객체이므로 menu.getDesc()
        for(ChickenMenu menu : menus){
            System.out.println(menu.getDesc());
        }

        System.out.println("---------------");
        Chicken store = new Chicken();

        for(String menuName : "양념치킨, 능이백숙, 땡초치킨".split(", ")){
            store.takeOrder(menuName);
        }
    }
}
