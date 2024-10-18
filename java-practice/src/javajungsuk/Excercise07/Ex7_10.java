package javajungsuk.Excercise07;

// 💡 매개변수의 유효성 검사를 반드시 해야 한다.

//class MyTv{
//    private boolean isPowerOn;
//    private int channel;
//    private int volume;
////    private int prevChannel;
////    private ArrayList<Integer> prevChannel = new ArrayList<Integer>();
//    private Stack<Integer> prevChannel = new Stack();
//
//    final int MAX_VOLUME = 100;
//    final int MIN_VOLUME = 0;
//    final int MAX_CHANNEL = 100;
//    final int MIN_CHANNEL = 0;
//
//    // getter, setter 메서드 추가
//    public boolean isPowerOn(){
//        return isPowerOn;
//    }
//
//    public void setPowerOn(boolean powerOn){
//        isPowerOn = powerOn;
//    }
//
//    public int getChannel(){
//        return channel;
//    }
//
//    public void setChannel(int channel){
////        prevChannel = this.channel;
////        prevChannel.add(this.channel);
//        prevChannel.push(this.channel);
//        this.channel = channel;
//    }
//
//    public int getVolume(){
//        return volume;
//    }
//
//    public void setVolume(int volume){
//        this.volume = volume;
//    }
//
//    // 7-11. 이전 채널로 이동하는 메서드 추가
//    public void gotoPrevChannel(){
////        channel = prevChannel.get(prevChannel.size()-1);
////        prevChannel.remove(prevChannel.size()-1);
//
//        int tmp = prevChannel.pop();
//        setChannel(tmp);
//
//        channel = prevChannel.peek();
//
//    }
//
//}
//
//public class Ex7_10 {
//    public static void main(String[] args) {
//        MyTv t = new MyTv();
//
//        t.setChannel(10);              // prevChannel = 0
//        System.out.println("Channel : " + t.getChannel());
//
//        t.setChannel(20);             // prevChannel = 10
//        System.out.println("Channel : " + t.getChannel());
//
//        t.gotoPrevChannel();         // channel = 10
//        System.out.println("Channel : " + t.getChannel());
//
//        t.gotoPrevChannel();        // channel = 10
//        System.out.println("Channel : " + t.getChannel());
//
//    }
//}
