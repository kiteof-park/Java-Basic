package sec05.chap02.ex03;

public class ChickenMenu {
    String name;
    int price;
    String cook  = "fry";

    // 생성자1
    ChickenMenu(String name, int price){
        this.name = name;
        this.price = price;
    }

    // 생성자2
    ChickenMenu(String name, int price, String cook){
        this.name = name;
        this.price = price;
        this.cook = cook;
    }

}
