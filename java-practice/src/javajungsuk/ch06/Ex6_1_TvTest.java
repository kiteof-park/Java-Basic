package javajungsuk.ch06;

class Tv{
    String color;
    boolean power;
    int channel;

    void power(){ power = !power; }
    void channelUp(){ ++channel;}
    void channelDown(){ --channel; }
}


public class Ex6_1_TvTest {
    public static void main(String[] args) {
        Tv t = new Tv();
        t.channel = 7;
        t.power = true;

        t.power();
        t.channelUp();

        System.out.println(t.power);
        System.out.println(t.channel);
    }
}
