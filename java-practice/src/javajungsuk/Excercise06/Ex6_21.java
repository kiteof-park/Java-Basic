package javajungsuk.Excercise06;

class MyTv{
    boolean isPowerOn;
    int channel;
    int volume;

    final int MAX_VOLUME = 100;
    final int MIN_VOLUME = 0;
    final int MAX_CHANNEL = 100;
    final int MIN_CHANNEL = 0;
    
    
    // 메서드에 else 추가
    void turnOff(){
        isPowerOn = !isPowerOn;
    }

    void volumeUP(){
        if(volume < MAX_VOLUME){
            volume++;
        }
    }

    void volumeDown(){
        if(volume > MIN_VOLUME){
            volume--;
        }
    }

    void channelUp(){
        if(channel == MAX_CHANNEL){
            channel = MIN_CHANNEL;
        }
        channel++;
    }

    void channelDown(){
        if(channel == MIN_CHANNEL){
            channel = MAX_CHANNEL;
        }
        channel--;
    }

    @Override
    public String toString() {
        return "Channel : %d, Volume : %d".formatted(channel, volume);
    }
}


public class Ex6_21 {
    public static void main(String[] args) {
        MyTv tv = new MyTv();

        tv.channel = 100;
        tv.volume = 0;
        System.out.println(tv);

        tv.channelDown();
        tv.volumeDown();
        System.out.println(tv);

        tv.volume = 100;
        tv.channelUp();
        tv.volumeUP();
        System.out.println(tv);

    }
}
