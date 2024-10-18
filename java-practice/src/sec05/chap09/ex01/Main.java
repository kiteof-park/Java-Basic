package sec05.chap09.ex01;

public class Main {
    public static void main(String[] args) {
        //  ⭐ 다형성
        PolarBear polarBear = new PolarBear();
        // PolarBear의 부모 클래스인 Mammal에 대입 가능
        Mammal mammal = polarBear;
        // PolarBear의 인터페이스인 Swimmer에 대입 가능
        Swimmer swimmer = polarBear;

        GlidingLizard glidingLizard = new GlidingLizard();
        Eagle eagle = new Eagle();

        // 💡 인터페이스 역시 다형성에 의해 자료형으로 작용 가능
        // 모두 Hunter 인터페이스를 가짐
        Hunter[] hunters = {
                polarBear, glidingLizard, eagle
        };

        for (Hunter hunter : hunters) {
            hunter.hunt();
        }



    }
}
