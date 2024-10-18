package javajungsuk.Excercise07;

// 💡 추상 클래스는 추상 메서드를 가지고 있어야 한다.
// 💡 추상 메서드는 꼭 필요하지만 자손마다 다르게 구현될 것으로 예상되는 경우 추상 메서드로 작성한다.

abstract class Unit{
    int x, y;

    // 💡 클래스마다 이동하는 방법이 다르므로 move()를 추상 메서드로 정의한다.
    abstract void move(int x, int y);
    void stop(){
        System.out.println("정지!");
    }
}

class Marine extends Unit{
    @Override
    void move(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void stimPack(){
        System.out.println("스팀팩 사용");
    }
}

class Tank extends Unit{
    @Override
    void move(int x, int y) {
        this.x = x;
        this.y = y;
    }
    void changeMode(){
        System.out.println("공격모드 변환");
    }

}

class Dropship extends Unit{
    @Override
    void move(int x, int y) {
        this.x = x;
        this.y = y;
    }
    void load(){
        System.out.println("선택된 대상 태우기");
    }
    
    void unload(){
        System.out.println("선택된 대상 내리기");
    }
}
