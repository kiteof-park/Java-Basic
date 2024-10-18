package sec05.chap10.ex02;

public class Tab {
    private Setting setting = null;

    // 생성자1
    public Tab() {}

    // ⭐ 생성자2
    public Tab(Setting setting) {
        this.setting = setting;
    }

    // ⭐ setter()
    public void setSetting(Setting setting) {
        this.setting = setting;
    }

    public Setting getSetting() {
        return setting;
    }
}