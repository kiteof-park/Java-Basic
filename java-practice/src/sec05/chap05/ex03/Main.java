package sec05.chap05.ex03;

public class Main {
    public static void main(String[] args) {

        Slime slime = new Slime();
        FireSlime fireSlime = new FireSlime();

        slime.attack(fireSlime); // 다른 클래스의 인스턴스를 인자로 받음
        fireSlime.attack(slime);
    }
}
