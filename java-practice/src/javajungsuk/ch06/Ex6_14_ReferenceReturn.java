package javajungsuk.ch06;

public class Ex6_14_ReferenceReturn {
    public static void main(String[] args) {
        Data d1 = new Data();
        d1.x = 10;
        System.out.println("main(): x = " + d1.x);

        Data d2 = copy(d1);
        System.out.println("d1.x = " + d1.x);
        System.out.println("d2.x = " + d2.x);

    }

    static Data copy(Data d){
        Data tmp = new Data();
        tmp.x = d.x;
        return tmp;
    }
}
