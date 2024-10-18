package sec05.chap07;

public class YalcoChicken {
    // static : 클래스 변수, 정적 필드
    // final : write-once 필드
    protected static final String CREED = "우리의 튀김옷은 얄팍하다.";

    private final int no;
    public String name;

    // final을 선언만 하고 초기화하지 않은 경우, 생성자에서 반드시 초기화
    //  ⭐️필수 - no는 final초기화되지 않았으므로
    // no는 인스턴스 필드로 인스턴스마다 각각 다른값을 가져야하는데 생성 이후 그 값이 변하지 않아야 하는 경우
    public YalcoChicken(int no, String name) {
        this.no = no;
        this.name = name;
    }

    public void changeFinalFields() {
        // ⚠️ 불가
//        this.no++;
    }

    public final void fryChicken() {
        System.out.println("염지, 반죽입히기, 튀김");
    }
}
