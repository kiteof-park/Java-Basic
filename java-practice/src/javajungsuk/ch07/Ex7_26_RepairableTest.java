package javajungsuk.ch07;

public class Ex7_26_RepairableTest {
    public static void main(String[] args) {
        SCV scv = new SCV();

        scv.repair(new Tank());
        scv.repair(new DropShip());
//        scv.repair(new Marine());
    }
}

// 타입 체크를 위한 인터페이스
interface Repairable {}

// 클래스들의 최고 조상
class Units{
    int hitPoint;
    final int MAX_HP;

    Units(int hp){ MAX_HP = hp; }
}

class GroundUnit extends Units{
    GroundUnit(int hp){ super(hp); }
}

class AirUnit extends Units{
    AirUnit(int hp){ super(hp); }
}

class Tank extends GroundUnit implements Repairable{
    Tank(){
        super(150);
        hitPoint = MAX_HP;
    }

    public String toString(){ return "Tank"; }
}

class DropShip extends AirUnit implements Repairable{
    DropShip(){
        super(125);
        hitPoint = MAX_HP;
    }

    public String toString(){ return "DropShip"; }
}

class Marine extends GroundUnit{
    Marine(){
        super(40);
        hitPoint = MAX_HP;
    }
    public String toString(){ return "Marine"; }
}

class SCV extends GroundUnit implements Repairable{
    SCV(){
        super(60);
        hitPoint = MAX_HP;
    }

    // Repairable 인터페이스를 구현한 클래스의 인스턴스를 매개변수로 받음
    public void repair(Repairable r){
        if (r instanceof Units){        // r이 Units의 인스턴스인지 타입 체크
            Units u = (Units) r;        // Units의 인스턴스 변수를 사용하기 위해 형변환

            System.out.println(u+"의 현재 hitPoint: " + u.hitPoint);
            System.out.println(u+"의 현재 MAX_HP: " + u.MAX_HP);

            while(u.hitPoint != u.MAX_HP){
                u.hitPoint++;           //  HP를 증가시킴
            }
            System.out.println(u + "의 수리가 완료되었습니다.");
            System.out.println(u+"의 수리 후 hitPoint: " + u.hitPoint);
        }
    }

    public String toString(){ return "SCV"; }
}


