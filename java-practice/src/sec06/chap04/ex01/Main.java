package sec06.chap04.ex01;

import sec05.chap08.ex01.*;

public class Main {
    public static void main(String[] args) {
        // 추상클래스 YalcoGroup
        YalcoGroup store1 = new YalcoChicken("울산");
        YalcoGroup store2 = new YalcoCafe("창원", true);

        // YalcoGroup은 추상클래스 -> 원래 인스턴스를 직접 생성하지 못함
        // 일회성으로 사용할 인스턴스의 클래스를 익명 클래스로 작성
        // 부모 클래스 생성자 호출 후 {}내에 익명 클래스 작성
        YalcoGroup store3 = new YalcoGroup(1, "포항") {

            // YalcoGroup의 추상메서드 takeOrder() 오버라이드
            // takeOrder()는 접근 권한이 public이어야 함
            @Override
            public void takeOrder() {
                System.out.printf(
                        "유일한 얄코과메기 %s 과메기를 주문해주세요. %n",
                        super.intro()
                );
                // 익명 클래스의 dryFish() 메서드를 호출하기 위한 방법
                 dryFish();
            }
            public void dryFish(){
                System.out.println("과메기 말리기");
            }
        };

        // YalcoGroup의 메서드 실행
        // var store3Intro = store3.intro();
        System.out.printf("store3.intro(): %s %n",  store3.intro());

        System.out.print("store3.takeOrder(): ");
        // YalcoGroup의 추상 메서드를 오버라이드해서 실행
        store3.takeOrder();

        // 익명 클래스의 자체적인 메서드는 호출할 수 없음
        // dryFish()를 사용하려면 다른 메서드 안에 넣어서 사용
        // store3.dryFish();

        System.out.println("------------------");

        for(YalcoGroup store : new YalcoGroup[]{store1, store2, store3}){
            store.takeOrder();
        }
    }
}
