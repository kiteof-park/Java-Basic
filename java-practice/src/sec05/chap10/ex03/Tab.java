package sec05.chap10.ex03;

public class Tab {
    // Tab의 필드인 setting - 공유되는 유일한 인스턴스를 받아옴
    private Setting setting = Setting.getInstance();

    public Setting getSetting(){
        return setting;
    }
}
