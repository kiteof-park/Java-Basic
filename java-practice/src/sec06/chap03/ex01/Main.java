package sec06.chap03.ex01;

public class Main {
    public static void main(String[] args) {

        //  Outer의 static 내부 클래스 객체 생성
        Outer.InnerSttcMember sttcMember = new Outer.InnerSttcMember();
        sttcMember.func();

        System.out.println("-----");

        // Outer 객체 생성
        Outer outer = new Outer();
        outer.innerFuncs();

        System.out.println("-----");

        // ⚠️ error
        // Outer.InnerInstMember innerInstMember = new Outer.InnerInstMember();

        // instance 내부 클래스 객체 생성
        Outer.InnerInstMember innerInstMember = outer.getInnerInstMember();
        innerInstMember.func();

        System.out.println("-----");

        outer.memberFunc();
    }
}
