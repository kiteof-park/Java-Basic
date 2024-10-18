package javajungsuk.Excercise06;

class Marine{

    int x = 0, y = 0;       // Marine의 위치 좌표(x,y)
    int hp = 60;            // 현재 체력
//    int weapon = 6;         // 공격력
//    int armor = 0;          // 방어력

    // 모든 병사의 공격력과 방어력은 같아야 한다. -> static 변수로 변경
    static int weapon = 6;
    static int armor = 0;

//    void weaponUp(){ weapon++; }
//    void armorUp(){armor++;}

    // weaponUp(), armorUp()에서 iv가 아닌 cv만 사용 -> static 메서드로 변경
    static void weaponUp(){ weapon++; }
    static void armorUp(){armor++;}
    void move(int x, int y){
        this.x = x;
        this.y = y;
    }
}

public class Ex6_9 {
    public static void main(String[] args) {
        // 6-9. Marine 클래스 멤버 중 static 변수로 선언되어야 할 것은?
        System.out.println("weapon, armor : 모든 병사의 공격력과 방어력은 동일해야 한다.");

        Marine marine = new Marine();
    }
}
