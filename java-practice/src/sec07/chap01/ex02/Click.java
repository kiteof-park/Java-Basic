package sec07.chap01.ex02;

public class Click {
    int x;
    int y;
    int timestamp;

    public Click(int x, int y, int timestamp){
        this.x = x;
        this.y = y;
        this.timestamp = timestamp;
    }

    @Override
    public boolean equals(Object obj) {
        // obj가 Click 인스턴스가 아니라면 false반환
        if(!(obj instanceof Click)) return false;

        // 현재 Click인스턴스인 this.x와 주어진 Object인스턴스인 obj.x를 비교
        // Object(부모)타입으로 들어온 obj를 Click(자식)타입으로 강제 타입 변환
        return this.x == ((Click) obj).x && this.y == ((Click) obj).y;
    }
}
