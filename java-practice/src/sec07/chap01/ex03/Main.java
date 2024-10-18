package sec07.chap01.ex03;

public class Main {
    public static void main(String[] args) {
        Click click1 = new Click(123, 456, 5323487);
        Click click2 = new Click(123, 456, 5323487);
        Click click3 = new Click(123, 456, 2693702);
        Click click4 = new Click(234, 567, 93827345);

        int click1Hash = click1.hashCode();
        int click2Hash = click2.hashCode();
        int click3Hash = click3.hashCode();
        int click4Hash = click4.hashCode();
    }
}
