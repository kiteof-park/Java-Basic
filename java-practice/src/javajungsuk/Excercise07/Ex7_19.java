package javajungsuk.Excercise07;

//public class Ex7_19 {
//    public static void main(String[] args) {
//        Buyer b = new Buyer();
//        b.buy(new Tv());
//        b.buy(new Computer());
//        b.buy(new Tv());
//        b.buy(new Audio());
//        b.buy(new Computer());
//        b.buy(new Computer());
//        b.buy(new Computer());
//
//        b.summary();
//    }
//}
//
//class Buyer {
//    int money = 1000;                   // 가진 돈
//    Product[] cart = new Product[3];    // 구입한 제품을 저장하기 위한 배열 cart
//    int i = 0;                          // 배열 cart에 사용될 index
//
//    // 제품 구입 기능의 buy메서드
//    void buy(Product p) {
//        // 1.1
//        if (money < p.price) {
//            System.out.println("잔액이 부족하여 " + p +"을/를 살 수 없습니다." );
//            return;
//        }
//        // 1.2
//        else {
//            money -= p.price;
//            add(p);
//        }
//    }
//
//    // 장바구니에 구입한 물건을 추가하는 add메서드
//    void add(Product p) {
//        // 1.1
//        if (i >= cart.length) {
//            Product[] newCart = new Product[cart.length * 2];       // 1.1.1
//            for (int i = 0; i < cart.length; i++) {                 // 1.1.2
//                newCart[i] = cart[i];
//            }
//            cart = newCart;                                         // 1.1.3
//        }
//        cart[i] = p;
//        i++;
//    }
//
//    // 구입한 물건의 목록과 사용금액, 남은 금액을 출력하는 summary메서드
//    void summary(){
//        String list = "";
//        int sum = 0;
//
//        if(cart.length == 0){
//            return;
//        }
//        else{
//            for(Product p : cart){
//                sum += p.price;
//                list += (p.toString() + " ");
//            }
//        }
//
//        System.out.println("목록: " + list);
//        System.out.println("총 합계: " + sum);
//        System.out.println("남은 돈: " + money);
//    }
//}
//
//class Product{
//    int price;      // 제품의 가격
//
//    Product(int price){
//        this.price = price;
//    }
//}
//
//class Tv extends Product{
//    Tv(){ super(100); }
//
//    public String toString(){
//        return "Tv";
//    }
//}
//
//class Computer extends Product{
//    Computer(){super(200);}
//
//    public String toString(){
//        return "Computer";
//    }
//}
//
//class Audio extends Product{
//    Audio(){super(50);}
//
//    public String toString(){
//        return "Audio";
//    }
//}