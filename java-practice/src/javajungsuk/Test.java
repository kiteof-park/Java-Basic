package javajungsuk;

interface I{
    void methodB();
}

class A{
    public void methodA(I i){
        i.methodB();
    }
}

class B implements I{
    public void methodB(){
        System.out.println("methodB from class B");
    }
}

public class Test{
    public static void main(String[] args) {
        A a = new A();
        a.methodA(new B());
    }
}