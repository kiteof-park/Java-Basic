package sec06.chap02.pkg2;

import sec06.chap02.pkg1.Parent;

public class Child extends Parent {
    // 다른 패키지의 클래스로부터 상속 가능
    // Parent의 c는 protected, Child의 cc는 default
    int cc = c;
    // Parent의 d는 public, Child의 dd는 default
     int dd = d;
}
