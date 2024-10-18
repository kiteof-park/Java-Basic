package sec06.chap02.pkg1;

public class Child extends Parent {
    // Parent와 같은 패키지
    // int aa = a; // ⚠️ 불가
    // private : 상속을 못받는 것이 아니라, 상속 받은 자식 클래스 내부에서 사용할 수 없음
    int bb = b;
    int cc = c; // 💡 protected - 같은 패키지, 상속관계
    int dd = d;
}
