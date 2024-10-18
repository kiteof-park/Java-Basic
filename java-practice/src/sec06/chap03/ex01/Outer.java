package sec06.chap03.ex01;

public class Outer {

    // Outer의 멤버 iv, cv
    private String inst = "인스턴스";
    private static String sttc = "클래스";

    // Outer의 내부 클래스 1. instance 클래스
    class InnerInstMember{

        // Outer의 iv 접근 가능
        private String name = inst + " 필드로서의 클래스";
        // Outer의 static 내부 클래스에 접근 가능
        private InnerSttcMember innerSttcMember = new InnerSttcMember();

        public void func(){
            System.out.println(name);
        }
    }

    // Outer의 내부 클래스 2. static 클래스
    public static class InnerSttcMember{
        // Outer의 cv에만 접근 가능
        private String name = sttc + " 필드로서의 클래스";

        // Outer의 instance 클래스 접근 불가
        // private InnerInstMember innerInstMember = new InnerInstMember

        public void func(){
            System.out.println(name);
        }
    }

    // Outer의 instance 메서드1
    public void memberFunc(){
        // Outer의 내부 클래스 3. local 클래스
        // 스코프가 메소드 내로 제한됨
        class MethodMember{
            // Outer의 iv, cv, instance클래스, static 클래스 접근 가능
            String instSttc = inst + " " + sttc;
            InnerInstMember innerInstMember = new InnerInstMember();
            InnerSttcMember innerSttcMember = new InnerSttcMember();

            public void func(){
                innerSttcMember.func();
                innerSttcMember.func();
                System.out.println("메소드 안의 클래스");

                // 스택 오버플로우
                // new Outer().memberFunc();
            }
        }
        new MethodMember().func();
    }

    // Outer의 instance 메서드2
    public void innerFuncs(){
        new InnerInstMember().func();
        new InnerSttcMember().func();;
    }

    // Outer의 instance 메서드3
    public InnerInstMember getInnerInstMember(){
        return new InnerInstMember();
    }
}
