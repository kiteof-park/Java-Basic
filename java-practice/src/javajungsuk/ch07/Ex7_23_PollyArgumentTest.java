package javajungsuk.ch07;


import java.util.Vector;

public class Ex7_23_PollyArgumentTest {
    public static void main(String[] args) {
        Buyer b = new Buyer();

        Tv tv = new Tv();
        Audio audio = new Audio();
        Computer computer = new Computer();

        b.buy(tv);
        b.buy(audio);
        b.buy(computer);
        b.summary();

        System.out.println();

        b.refund(computer);
        b.summary();
    }
}


class Product{
    int price;
    int bonusPoint;

    Product(int price){
        this.price = price;
        bonusPoint = (int)(price/10.0);
    }
}

class Buyer{
    int money = 1000;
    int bonusPoint = 0;
    Vector item = new Vector();     // 구매 물품 리스트
    
    
    // 구매 메서드
    void buy(Product p){
        if(money < p.price){
            System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
            return;
        }
        money -= p.price;
        bonusPoint += p.bonusPoint;
        item.add(p);                // 구매한 물품을 벡터에 저장
        System.out.println(p + "을/를 구입하셨습니다.");
    }
    
    // 환불 메서드
    void refund(Product p){
        if((item.remove(p))){       // 구매 물품 리스트 제거를 성공하면
            money += p.price;
            bonusPoint -= p.bonusPoint;
            System.out.println(p + "을/를 반품하셨습니다.");
        }
        else{
            System.out.println("구입하신 제품 중 해당 제품이 없습니다.");
        }
    }

    // 구매 물품 리스트와 합계
    void summary(){
        int sum = 0;
        String list = "";

        for(int i = 0; i < item.size(); i++){
            // item은 Vector 객체, Vector 요소는 배열처럼 직접 인덱싱 불가
            // sum += item[i].price;

            // Vector의 요소를 읽으려면 get()메서드 사용
            Product p = (Product) item.get(i);
            sum += p.price;
            // list += p.toString() + ", ";
            list += (i == 0) ? "" + p : ", " + p;
        }

        System.out.println("구입한 제품의 총 합계: " + sum);
        System.out.println("구입한 제품 리스트: " + list);
    }
}

class Tv extends Product{
    Tv(){super(100);}
    public String toString(){
        return "Tv";
    }
}

class Audio extends Product{
    Audio(){super(50);}
    public String toString(){
        return "Audio";
    }
}

class Computer extends Product{
    Computer(){super(200);}
    public String toString(){
        return "Computer";
    }
}

