package javajungsuk.ch07;



public class Ex7_24_FighterTest {
    public static void main(String[] args) {
        Fighter f = new Fighter();

        if(f instanceof Unit){ System.out.println("f는 Unit의 자손 클래스"); }

        if(f instanceof Fightable){ System.out.println("f는 Fightable인터페이스를 구현"); }

        if(f instanceof Movable){ System.out.println("f는 Movable인터페이스를 구현"); }

        if(f instanceof Attackable){ System.out.println("f는 Attackable인터페이스를 구현"); }
    }
}

class Fighter extends Unit implements Movable, Attackable{
    public void move(int x, int y){}
    public void attack(Unit u){}
}

class Unit{
    int currentHp;
    int x;
    int y;
}


interface Fightable extends Movable, Attackable{ }

interface Movable{ void move(int x, int y); }

interface Attackable{ void attack(Unit u);}