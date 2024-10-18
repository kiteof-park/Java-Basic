package hon_gong_java.sec02.exam05;

public class ChildExample {
    public static void main(String[] args) {
        Parent parent = new Child();    // 업캐스팅
        parent.pField = "data1";
        parent.pMethod1();
        parent.pMethod2();

//        parent.cField = "data2";
//        parent.cMethod3();

        Child child = (Child) parent;
        child.cField = "data2";
        child.cMethod3();
    }
}
