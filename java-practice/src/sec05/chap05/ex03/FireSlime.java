package sec05.chap05.ex03;

public class FireSlime extends Slime {
    private int fireAttack = 4;

    // 부모 클래스에 생성자가 없으므로, 자식 클래스에서도 작성하지 않음
    @Override
    public void attack(Slime enemy) {
//        super.attack(enemy);
        enemy.hp -= (attack + fireAttack) * (1-enemy.defense);
    }
}
