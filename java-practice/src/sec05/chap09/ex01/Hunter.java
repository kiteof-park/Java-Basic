package sec05.chap09.ex01;

public interface Hunter {
    // ⭐️ 인터페이스의 필드는 final (생략 가능)
    //  필드가 final이므로 초기화하지 않을 시 오류
    String position = "포지션";
    void hunt();
}
