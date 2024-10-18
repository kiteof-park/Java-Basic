package javajungsuk.ch07;



interface I{
    void methodB();
}

class A{
    void methodA(){
        // 제 3클래스의 메서드를 통해 인터페이스 I를 구현한 클래스의 인스턴스를 얻음
        I i = InstanceManager.getInstance();
        i.methodB();
        System.out.println(i.toString());
        
    }
}
class B implements I{
    @Override
    public void methodB() {
        System.out.println("methodB from class B");
    }

    @Override
    public String toString() {
        return "class B";
    }
}
class InstanceManager{
    public static I getInstance(){
        return new B();
    }
}

public class Ex7_29_InterfaceTest2 {
    public static void main(String[] args) {
        new A().methodA();
    }
}
