package sec05.chap03.ex01;

public class Main {
    public static void main(String[] args) {
        String ycBrand = YalcoChicken.brand;
        String ycContact = YalcoChicken.contact();

        YalcoChicken store1 = new YalcoChicken(3, "판교");
        String st1Intro = store1.intro();
    }
}
