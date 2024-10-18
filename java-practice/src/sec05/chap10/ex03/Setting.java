package sec05.chap10.ex03;

// Setting 클래스를 싱글턴으로 만들기
public class Setting {

    // static(정적) 필드 - 프로그램 메모리에 하나만 존재
    private static Setting setting;

    // 생성자를 private으로 지정 - 외부에서 생성자로 생성하지 못하도록
    // Setting 클래스 내에서만 생성자 호출 가능
    private Setting(){}

    // getter() - 공유되는 인스턴스를 받아가는 public 클래스 메소드
    // 싱글턴에서 자주 사용하는 메소드명
    public static Setting getInstance(){
        // 아직 인스턴스가 만들어지지 않았다면 생성
        // 프로그램에서 처음 호출시 실행
        if(setting == null){ setting = new Setting(); }
        return setting;
    }

    private int volume = 5;
    public int getVolume(){ return volume; }
    public void incVolume() { volume++; }
    public void decVolume() { volume--; }
}
