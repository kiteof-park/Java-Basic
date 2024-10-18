package hon_gong_java.sec08_2.exam05;

public class InterfaceInheritance {
    public static void main(String[] args) {

        ClassABC abc = new ClassABC();

        InterfaceA a = abc;
        InterfaceB b = abc;
        InterfaceC c = abc;

        a.methodA();
        b.methodB();
        c.methodA();
        c.methodB();
        c.methodC();
    }
}
