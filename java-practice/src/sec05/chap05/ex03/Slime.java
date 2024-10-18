package sec05.chap05.ex03;

public class Slime {
    protected double hp = 50;
    protected int attack = 8;
    protected double defense = 0.2;

    // 부모 클래스 Slime의 생성자가 없음
    // 컴파일러가 자동 생성

    public void attack(Slime enemy){
        enemy.hp -= this.attack * (1 - enemy.defense);
    }
}
