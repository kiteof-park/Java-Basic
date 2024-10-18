package sec05.chap02.ex01;

public class Slime {
    double hp = 50;
    int attack = 8;
    double defense = 0.2;

    // 💡 다른 슬라임의 인스턴스를 인자로 받음
    // attack은 this.attack
    void attack(Slime enemy){
        enemy.hp -= attack * (1-enemy.defense);
    }


}
