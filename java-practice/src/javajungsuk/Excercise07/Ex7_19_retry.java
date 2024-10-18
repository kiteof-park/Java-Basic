package javajungsuk.Excercise07;

// 💡 null의 경우를 고려해야 한다.

public class Ex7_19_retry {
    public static void main(String[] args) {
        Buyer b = new Buyer();

        b.buy(new Tv());
        b.buy(new Computer());
        b.buy(new Tv());
        b.buy(new Audio());
        b.buy(new Computer());
        b.buy(new Computer());
        b.buy(new Computer());

        b.summary();
    }
}

class Buyer{
    int money = 1000;
    Product[] cart = new Product[3];    // 구입한 제품을 저장하기 위한 배열
    int i = 0;                          // Product배열 cart에 사용될 index

    void buy(Product p){
        if(money < p.price){
            System.out.println("잔액이 부족하여 " + p +"을/를 살 수 없습니다.");
            return;
        }
        money -= p.price;
        add(p);
    }

    void add(Product p){
        if(i >= cart.length){
            Product[] newCart = new Product[cart.length * 2];

            // 1.1.2 기존의 장바구니 내용을 새로운 배열에 복사한다.
            for(int i = 0; i < cart.length; i++){
                newCart[i] = cart[i];
            }

            // 💡1.1.2 모범답안
            // System.arraycopy(cart, 0, newCart, 0, cart.length);

            cart = newCart;
        }

        // 1.2 물건을 장바구니(cart)에 저장하고, i값을 1증가 시킨다.
        cart[i] = p;
        i++;

        // 💡 1.2 모법답안
        // cart[i++] = p;
    }

    void summary(){
        StringBuilder list = new StringBuilder();
        int sum = 0;

        for(Product p : cart){
            list.append(p.toString() + " ");
            sum += p.price;
        }
        System.out.println("구입한 물건 : " + list);
        System.out.println("사용한 금액 : " + sum);
        System.out.println("남은 금액 : " + money);

        // 💡 summary() 모법 답안
//        String itemList = "";
//        int sum = 0;
//
//        for(int i = 0; i < cart.length; i++){
//            if(cart[i]==null) break;
//            itemList += cart[i] + ", ";
//            sum += cart[i].price;
//        }

    }
}

class Product{
    int price;

    Product(int price){
        this.price = price;
    }
}

class Tv extends Product{
    Tv(){super(100);}
    public String toString(){return "Tv";}
}

class Audio extends Product{
    Audio(){super(50);}
    public String toString(){return "Audio";}
}

class Computer extends Product{
    Computer(){super(200);}
    public String toString(){return "Computer";}
}
