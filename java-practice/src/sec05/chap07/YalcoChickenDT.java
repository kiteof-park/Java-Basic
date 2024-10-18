package sec05.chap07;

public final class YalcoChickenDT extends YalcoChicken {
    public YalcoChickenDT(int no, String name) {
        super(no, name);
    }

    //  ⚠️ 불가
    // fryChicken()은 final로 선언됨
//    public void fryChicken () {
//        System.out.println("염지, 반죽입히기, 미원, 튀김");
//    }

    // 생성자 추가할 것
}