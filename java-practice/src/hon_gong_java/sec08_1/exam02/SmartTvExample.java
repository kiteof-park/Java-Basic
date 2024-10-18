package hon_gong_java.sec08_1.exam02;

import hon_gong_java.sec08_1.exam01.RemoteControl;

public class SmartTvExample {
    public static void main(String[] args) {
        SmartTelevision tv = new SmartTelevision();

        RemoteControl rc = tv;
        Searchable search = tv;

        rc.turnOn();
        search.searchable("www.naver.com");

    }
}
